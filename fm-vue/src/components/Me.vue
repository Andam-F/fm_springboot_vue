<template>
  <div class="container">
    <el-radio-group v-model="labelPosition" size="small">
      <el-radio-button label="left">左对齐</el-radio-button>
      <el-radio-button label="right">右对齐</el-radio-button>
      <el-radio-button label="top">顶部对齐</el-radio-button>
    </el-radio-group>
    <div style="margin: 20px;"></div>
    <el-form :label-position="labelPosition" label-width="80px" :model="meForm" size="mini">
      <el-form-item label="姓名">
        <el-input v-model="meForm.userName"></el-input>
      </el-form-item>
      <el-form-item label="头像">
        <el-input v-model="meForm.userName"></el-input>
      </el-form-item>
      <el-form-item label="登录账号">
        <el-input v-model="meForm.loginId"></el-input>
      </el-form-item>
      <el-form-item label="昵称">
        <el-input v-model="meForm.nickName"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="meForm.password"></el-input>
      </el-form-item>
      <el-form-item label="个性签名">
        <el-input v-model="meForm.signature"></el-input>
      </el-form-item>
      <el-form-item label="性别">
      <el-input v-model="meForm.sex"></el-input>
      </el-form-item>
        <el-form-item label="生日">
        <el-input v-model="meForm.birthday"></el-input>
      </el-form-item>
        <el-form-item label="电话">
          <el-input v-model="meForm.telephone"></el-input>
        </el-form-item>
        <el-form-item label="邮箱">
          <el-input v-model="meForm.email"></el-input>
        </el-form-item>
        <el-form-item label="简介">
          <el-input v-model="meForm.intro"></el-input>
        </el-form-item>
        <el-form-item label="年龄">
          <el-input v-model="meForm.age"></el-input>
        </el-form-item>
        <el-form-item label="星座">
          <el-input v-model="meForm.constellation"></el-input>
        </el-form-item>
        <el-form-item label="血型">
          <el-input v-model="meForm.bloodype"></el-input>
        </el-form-item>
      <el-form-item label="毕业学校">
        <el-input v-model="meForm.schooltag"></el-input>
      </el-form-item>
      <el-form-item label="职业">
        <el-input v-model="meForm.vocation"></el-input>
      </el-form-item>
      <el-form-item label="国家">
        <el-input v-model="meForm.nationName"></el-input>
      </el-form-item>
      <el-form-item label="省份">
        <el-input v-model="meForm.proviceName"></el-input>
      </el-form-item>
      </el-form>
  </div>

</template>

<script>
import api from '@/components/common/api.js'

    export default {
      data() {
        return {
          msg: 'Me',
          meData: [],
          multipleSelection: [],
          select: {
            meCode: '',
            meName: ''
          },
          del_list: [],
          editVisible: false,
          editItemVisible: false,
          delVisible: false,
          meForm: {
            userId: '',
            loginId: '',
            nickName: '',
            password: '',
            signature: '',
            sex: '',
            birthday: '',
            telephone: '',
            userName: '',
            email: '',
            intro: '',
            headportrait: '',
            age: '',
            sex: '',
            constellation: '',
            bloodtype: '',
            schooltag: '',
            vocation: '',
            nationId: '',
            nationName:'',
            provinceId: '',
            provinceName:'',
            cityId: '',
            friendShipPolicyId: '',
            userStateId: '',
            friendPolicyQuestion: '',
            friendPolicyAnswer: '',
            friendPolicyPassword: '',
            createTime: ''
          },
          labelPosition: 'right',
        }
      },
      created:function (){
        this.getMeData()
      },
      methods:{
          getMeData()
          {
            api.getUserByName().then((res)=>{
              console.log(res);
            })

          }
        }
    }


</script>

<style>

</style>
