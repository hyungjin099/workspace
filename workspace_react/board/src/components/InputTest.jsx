

import React, { useState } from 'react'

const InputTest = () => {
  const [data, setData] = useState({
    id : '',
    age: '',
    name : ''
  });


 

  const person = {
    kor : 90,
    math : 80
  }

  const aaa = {
    ...person,
    kor:70 
  }



  const a = 'kor';

  person.a; //90
  person[a] //90



  const changeData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }
  return (
    <>
      <div>id : 
        <input type='text' name='id' onChange={(e) => {changeData(e)}}/></div>
      <div>나이 : 
        <input type='text' name='age' onChange={(e) => {changeData(e)}}/></div>


      <div>이름 : <input type='text' onChange={(e) => {
        setData({
          ...data,
          name : e.target.value
        });
      }}/></div>

    </>
  )
}

export default InputTest