import util from './util'

let api={
  //登录相关

  //用户相关
  addUser: p => util.post('/user/addUser',p),
  getUser: p => util.get('user/listUserPage',p),
  getUserByName: p => util.get('/user/getUser',p),
  updateUser: p => util.put('/user/updateUser',p),
  deleteUser: p => util.delete('/user/deleteUser',p)
}
