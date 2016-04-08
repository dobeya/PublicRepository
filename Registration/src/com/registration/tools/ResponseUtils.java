package com.registration.tools;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public final class ResponseUtils {
	
    public static void writeJsonObject(HttpServletResponse response, Object object) {
        writeJsonObject(response, object, null);
    }

    public static void writeJsonObject(HttpServletResponse response, Object object, String jsoncallback) {
        String jsonStr = "{}";

        if (object != null) {
            jsonStr = JSON.toJSONString(object, SerializerFeature.WriteMapNullValue);
        }

        StringBuilder sb = new StringBuilder();
        if (jsoncallback != null) {
            sb.append(jsoncallback).append("(").append(jsonStr).append(")");
        } else {
            sb.append(jsonStr);
        }

        writeJson(response, sb.toString());
    }

    public static void writeJsonArray(HttpServletResponse response, Object object) {
        writeJsonArray(response, object, null);
    }

    public static void writeJsonArray(HttpServletResponse response, Object object, String jsoncallback) {
        String jsonStr = "[]";

        if (object != null) {
            jsonStr = JSON.toJSONString(object, SerializerFeature.WriteMapNullValue);
        }

        StringBuilder sb = new StringBuilder();
        if (jsoncallback != null) {
            sb.append(jsoncallback).append("(").append(jsonStr).append(")");
        } else {
            sb.append(jsonStr);
        }

        writeJson(response, sb.toString());
    }

    public static void writeJson(HttpServletResponse response, String jsonStr) {
        write(response, "application/json; charset=UTF-8", jsonStr);
    }

    public static void writeText(HttpServletResponse response, String text) {
        write(response, "text/plain; charset=UTF-8", text);
    }

    private static void write(HttpServletResponse response, String contentType, String s) {
        response.setContentType(contentType);

        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(out);
        }
    }
    
    private ResponseUtils() {
    }
}
