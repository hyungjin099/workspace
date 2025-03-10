import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios_2 = () => {
  //서버에서 받은 데이터를 저장할 state 변수
  const [person, setPerson] = useState({});
  console.log(person.name);


  //http://localhost:8080/t3
  useEffect(() => {
    axios.get('/api/t3')
    .then((res) => {
      console.log(res.data);
      setPerson(res.data);
    })
    .catch((error) => {
      console.log('통신 중 오류 발생~');
      console.log(error);
    });
  }, []);

  

  return (
    <>
      <div>Axios_2</div>
      <p>{person.name}</p>
    </>
  )
}

export default Axios_2