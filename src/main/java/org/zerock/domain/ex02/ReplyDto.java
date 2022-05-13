package org.zerock.domain.ex02;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReplyDto {
	private int id;
	private int boardId; // board_id column과 매칭하기 위해 별칭(alias)을 줘야함
	private String content;
	private LocalDateTime inserted;
}
