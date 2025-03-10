import React from 'react'

const Map_4 = () => {
  const boardList = [
    {
      boardNum : 1,
      title : '첫번째 글',
      writer : '김자바',
      createDate : '2025-01-13',
      readCnt : 5
    },
    {
      boardNum : 2,
      title : '두번째 글',
      writer : '김자바',
      createDate : '2025-01-17',
      readCnt : 3
    },
    {
      boardNum : 3,
      title : '세번째 글',
      writer : '이자바',
      createDate : '2025-01-10',
      readCnt : 0
    },
    {
      boardNum : 4,
      title : '네번째 글',
      writer : '이자바',
      createDate : '2025-01-19',
      readCnt : 10
    },
    {
      boardNum : 5,
      title : '다섯번째 글',
      writer : '이자바',
      createDate : '2025-01-01',
      readCnt : 1
    },
  ];

  return (
    <>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
          </tr>
        </thead>
        <tbody>
        {
          boardList.map((board, index) => {
            return (
              <tr key={index}>
                <td>{boardList.length - index}</td>
                <td>{board.boardNum}</td>
                <td>{board.title}</td>
                <td></td>
                <td></td>
                <td></td>
              </tr>
            )
          })
        }
        </tbody>
      </table>
    </>
  )
}

export default Map_4