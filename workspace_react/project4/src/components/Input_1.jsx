
import React, { useState } from 'react'

const Input_1 = () => {
  //input 태그dml value 속성값을 저장할 state변수
  const [data, setData] = useState('');

  return (
    <>
      <h2>input태그에 데이터 입력받기</h2>

      <input type="text" value={data} onChange={(e) => {
        console.log(e.target.value);
        setData(e.target.value);
      }}/>

      <div>
        input 태그에 입력한 내용 : {data}
      </div>

    </>
  )
}

export default Input_1