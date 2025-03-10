import React from "react";

const Controller = (props) => {
  return (
    <>
      <div>
        <button type="button" onClick={(e) => {
          props.setCnt(props.cnt - 1);
        }}>-1</button>
        <button type="button">+1</button>
        <button type="button">+10</button>
      </div>
    </>
  );
};

export default Controller;
