import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Plan from '@/components/Plan'
import Date from '@/components/Date'
import Share from '@/components/Share'
import Recommend from '@/components/Recommend'
import Friends from '@/components/Friends'
import Me from '@/components/Me'

import DatePlay from '@/components/DatePlay'
import User from '@/components/User'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path:'/plan',
      name:'Plan',
      component: Plan
    },
    {
      path:'/date',
      name:'Date',
      component:Date
    },
    {
      path:'/share',
      name:'Share',
      component:Share
    },
    {
      path:'/recommend',
      name:'Recommend',
      component:Recommend
    },
    {
      path:'/friends',
      name:'Friends',
      component:Friends
    },
    {
      path:'/me',
      name:'Me',
      component:Me
    },
    {
      path:'/datePlay',
      name:'DatePlay',
      component:DatePlay
    },
    {
      path:'/user',
      name:'User',
      component:User
    }

  ]
})
