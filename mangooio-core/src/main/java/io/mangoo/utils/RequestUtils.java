package io.mangoo.utils;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import io.mangoo.enums.ContentType;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HeaderMap;
import io.undertow.util.Headers;
import io.undertow.util.Methods;

/**
 *
 * @author svenkubiak
 *
 */
public final class RequestUtils {
    private RequestUtils() {
    }

    /**
     * Converts request and query parameter into a single map
     *
     * @param exchange The Undertow HttpServerExchange
     * @return A single map contain both request and query parameter
     */
    public static Map<String, String> getRequestParameters(HttpServerExchange exchange) {
        Map<String, String> requestParamater = new HashMap<String, String>();

        Map<String, Deque<String>> queryParameters = exchange.getQueryParameters();
        queryParameters.putAll(exchange.getPathParameters());
        queryParameters.entrySet().forEach(entry -> requestParamater.put(entry.getKey(), entry.getValue().element())); //NOSONAR

        return requestParamater;
    }

    /**
     * Checks if the request is a POST or a PUT request
     *
     * @param exchange The Undertow HttpServerExchange
     * @return True if the request is a POST or a PUT request, false otherwise
     */
    public static boolean isPostOrPut(HttpServerExchange exchange) {
        return (Methods.POST).equals(exchange.getRequestMethod()) || (Methods.PUT).equals(exchange.getRequestMethod());
    }

    /**
     * Checks if the requests content-type contains application/json
     *
     * @param exchange The Undertow HttpServerExchange
     * @return True if the request content-type contains application/json, false otherwise
     */
    public static boolean isJSONRequest(HttpServerExchange exchange) {
        HeaderMap requestHeaders = exchange.getRequestHeaders();

        return requestHeaders != null && requestHeaders.get(Headers.CONTENT_TYPE) != null &&
                requestHeaders.get(Headers.CONTENT_TYPE).element().toLowerCase().contains(ContentType.APPLICATION_JSON.toString().toLowerCase());
    }
}