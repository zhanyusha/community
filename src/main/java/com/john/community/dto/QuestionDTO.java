package com.john.community.dto;

import com.john.community.model.User;
import lombok.Data;

/**
 * Crated by wuxin on 2019/6/18
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}