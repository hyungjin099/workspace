import React, { useState } from "react";
import './Test7.css'

const Test7 = () => {
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      <div>Test7</div>
      <div className="test7" 
        onMouseEnter={(e) => {}} 
        onMouseLeave={(e) => {
          setIsShow(false)
        }}>마우스를 올리면 글자 보임</div>
      {
        isShow ? <div className="test7">React</div> : null
      }
      
    </>
  );
};

export default Test7;
