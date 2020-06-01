package com.example;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 封装响应对象
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write (String content) throws IOException {
        StringBuffer httpResponse = new StringBuffer();

        //基于HTTP响应协议编写输出
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");

        System.out.println("返回信息--------->" + httpResponse.toString());
        System.out.println();

        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();

    }
}
