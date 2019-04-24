import {Message} from 'element-ui';
import axios from 'axios';


axios.interceptors.request.use(config=> {
  return config;
}, err=> {
  Message.error('请求超时!');
  return Promise.resolve(err);
})

axios.interceptors.response.use(data=> {
  if (data.status && data.status == 200 && data.data.status == 'error') {
    Message.error(data.data.msg);
    return;
  }
  return data;
}, err=> {
  if (err.response.status == 504||err.response.status == 404) {
    Message.error('服务器被吃了⊙﹏⊙∥');
  } else if (err.response.status == 403) {
    Message.error('权限不足,请联系管理员!');
  }else {
    Message.error('未知错误!');
  }
  return Promise.resolve(err);
})

const util={
  get(url) {
    return axios({
      method: 'get',
      url: `${apiUrl}${url}`
    });
  },
  getBy(url,params) {
    return axios({
      method: 'get',
      url: `${apiUrl}${url}`,
      data:params
    });
  },
  post(url, params) {
    return axios({
      method: 'post',
      url: `${apiUrl}${url}`,
      data: params
    });
  },

  postForm(url, params) {
    return axios({
      method: 'post',
      url: `${apiUrl}${url}`,
      data: qs.stringify(params),
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
      }
    });
  },

  put(url, params) {
    return axios({
      method: 'put',
      url: `${apiUrl}${url}`,
      data: params
    });
  },


  delete(url) {
    return axios({
      method: 'delete',
      url: `${apiUrl}${url}`,
    });
  },

  upload(url, params) {
    return axios({
      method: 'post',
      url: `${apiUrl}${url}`,
      data: qs.stringify(params),
      headers: {
        'Content-Type': 'multipart/form-data'
      }
    });
  }
}

export default util
