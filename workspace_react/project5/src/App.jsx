import { useEffect } from 'react'
import './App.css'
import { useState } from 'react';
import Effect_1 from './Effect_1';

function App() {
  const [cnt, setCnt] = useState(0);

  //useEffect : 컴포넌트의 생애주기에 맞춰 특징 기능을 실행하기 위해 사용!
  //useEffect는 매개변수로 2개의 데이터를 가짐
  //첫번째 매개변수 : 실행할 내용을 작성, 화살표 함수로 표현
  //두번째 매개변수 : 외존성 배열, 두번째 매개변수는 필요할 때만 사용!
  //useEffect 안의 코드는 html로 그림을 전부 그린 후 마지막에 실행

  //useEffect의 두번째 매개변수를 사용하지 않으면
  //컴포넌트가 mount 될때 + update 될때 실행
  // console.log(1);

  // useEffect(() => {
  //   console.log(111);
  // });

  // console.log(2);

 
  return (
    <>
      <div>react</div>
      <button type='button' onClick={(e) => {
        setCnt(cnt + 1);
      }}>버튼</button>
      <hr />
      <Effect_1 />
    </>
  )
}

export default App
