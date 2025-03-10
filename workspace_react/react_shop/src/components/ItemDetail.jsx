
import React, { useState } from 'react'
import styles from './ItemDetail.module.css'
import dayjs from 'dayjs'
import axios from 'axios'

const ItemDetail = ({itemDetail, setItemDetail, cnt, setCnt}) => {

  const changeItemDetail = (e) => {
    setItemDetail({
      ...itemDetail,
      [e.target.name] : e.target.value
    });
  }

  const updateItem = () => {
    axios.put('/api/items', itemDetail)
    .then(res => {
      alert('수정 완료');
      //게시글 목록을 다시 조회한다.
      setCnt(cnt + 1);
      
    })
    .catch(error => console.log(error));
  }

console.log(itemDetail);

  return (
    <>
      <h3>상품 상세 정보</h3>
      <table className={styles.detail_table}>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>
              <input className='my-input wide' type='text'
                value={itemDetail.itemNum}
                readOnly={true}
              />
            </td>
          </tr>
          <tr>
            <td>상품명</td>
            <td>
              <input className='my-input wide'  type='text'
                value={itemDetail.itemName}
                name='itemName'
                onChange={e => changeItemDetail(e)}
              />
            </td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td>
              <input className='my-input wide'  type='text'
                value={itemDetail.itemPrice}
                name='itemPrice'
                onChange={e => changeItemDetail(e)}
              />
            </td>
          </tr>
          <tr>
            <td>판매자</td>
            <td>
              <input className='my-input wide'  type='text'
                value={itemDetail.seller}
                readOnly={true}
              />
            </td>
          </tr>
          <tr>
            <td>상품등록일</td>
            <td>
              <input className='my-input wide'  type='text'
                value={
                  itemDetail.regDate ? 
                  dayjs(itemDetail.regDate).format('YYYY-MM-DD HH:mm:ss') : 
                  ''
                }
                readOnly={true}
              />
            </td>
          </tr>
          <tr>
            <td>상품설명</td>
            <td>
              <textarea 
                value={itemDetail.itemIntro}
                name='itemIntro'
                onChange={e => changeItemDetail(e)}
              ></textarea></td>
          </tr>
        </tbody>
      </table>
      <div>
        <button 
          className='btn btn-large' 
          type='button'
          onClick={e => updateItem()}
        >수정</button>
      </div>
    </>
  )
}    

export default ItemDetail