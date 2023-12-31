package com.randomchat.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 所属项目:random_chat
 *
 * @author rui10038 
 * @version 1.0
 * //                .-~~~~~~~~~-._       _.-~~~~~~~~~-.
 * //            __.'              ~.   .~              `.__
 * //          .'//    JAVA无涯      \./     回头是岸     \\`.
 * //        .'//                     |                     \\`.
 * //      .'// .-~"""""""~~~~-._     |     _,-~~~~"""""""~-. \\`.
 * //    .'//.-"                 `-.  |  .-'                 "-.\\`.
 * //  .'//______.============-..   \ | /   ..-============.______\\`.
 * //.'______________________________\|/______________________________`.
 * @date 2019/12/7 -下午 6:49
 **/
@Data
public class TransportDto {
    private Integer code;
    private String msg;
    private String toUserId;
    /**
     * 0文本1图片2视频;
     */
    private Integer type;
    private boolean success;

    public static TransportDto SUCCESS(Integer code,String msg) {
        return new TransportDto(code,msg,null,0,true);
    }
    public static TransportDto SUCCESSIMG(Integer code,String msg) {
        return new TransportDto(code,msg,null,1,true);
    }
    public static TransportDto SUCCESSVIDEO(Integer code,String msg) {
        return new TransportDto(code,msg,null,2,true);
    }
    public static TransportDto ERROR(Integer code,String msg) {
        return new TransportDto(code,msg,null,0,false);
    }

    public TransportDto(Integer code, String msg, String toUserId,Integer type, boolean success) {
        this.code = code;
        this.msg = msg;
        this.toUserId = toUserId;
        this.type = type;
        this.success = success;
    }
}
