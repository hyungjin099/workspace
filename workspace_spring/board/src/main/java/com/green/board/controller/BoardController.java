package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 api
  //(get) ~/boards
  @GetMapping("")
  public List<BoardDTO> getList(SearchDTO searchDTO){
    System.out.println(searchDTO);
    return boardService.selectBoardList(searchDTO);
  }

  //게시글 등록 api
  //(post) ~/boards
  @PostMapping("")
  public void insert(@RequestBody BoardDTO boardDTO){
    boardService.insertBoard(boardDTO);
  }

  //게시글 상세 조회 api
  //(get) ~/boards/1
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    return boardService.selectBoard(boardNum);
  }

  //게시글 삭제 api
  //(delete) ~/boards/1
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

  //게시글 수정 api
  //(put) localhost:8080/boards/3
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

}








