import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_4 = () => {
  //서버에서 넘어오는 데이터를 저장하기 위한 state 변수 생성
  const [personList, setPersonList] = useState([]);

  useEffect(() => {
    axios.get('/api/t4')
    .then((res) => {
      console.log(res.data);
      setPersonList(res.data);
    })
    .catch((res) => {console.log('오류 발생');});
  }, []);
  
  
  return (
    <>
      <div>Axios_4</div>
      <table border={1}>
        <thead>
          <tr>
            <td>이름</td>
            <td>나이</td>
            <td>주소</td>
          </tr>
        </thead>
        <tbody>
          {
            personList.map((person, i) => {
              return (
                <tr key={i}>
                  <td>{person.name}</td>
                  <td>{person.age}</td>
                  <td>{person.addr}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  );
};

export default Axios_4;
