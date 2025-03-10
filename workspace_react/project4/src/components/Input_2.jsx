
import React, { useState } from 'react'

const Input_2 = () => {

  

  // const [name, setName] = useState('');
  // const [age, setAge] = useState('');
  // const [addr, setAddr] = useState('');

  //모든 input태그에 입력한 데이터를 저장할 state 변수
  const [data, setData] = useState({
    name : '',
    age : '',
    addr : ''
  });

  //input태그의 값이 변경되는 실행시킬 함수
  function changeData(e){
    setData({
      ...data,
      [e.target.name] : e.target.value
    });
  }

  return (
    <>
      주소 : <input name='addr' type="text" value={data.addr} onChange={(e) => {
        changeData(e);
      }}/>
      <br />

      나이 : <input name='age' type="text" value={data.age} onChange={(e) => {
        changeData(e);
      }}/> 
      <br />

      이름 : <input name='name' type="text" value={data.name} onChange={(e) => {
        changeData(e);
      }}/> 
      <br />

      <div>
        입력받은 이름 : {data.name}
      </div>
      <div>
        입력받은 나이 : {data.age}
      </div>
      <div>
        입력받은 주소 : {data.addr}
      </div>

    </>
  )
}

export default Input_2