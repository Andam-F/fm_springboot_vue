# fm-vue

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).

├── App.vue                      // APP入口文件
├── api                          // 接口调用工具文件夹
│   └── index.js                 // 接口调用工具
├── components                   // 组件文件夹
├── frame                        // 子路由文件夹
├── main.js                      // 项目配置文件
├── page                         // 页面组件文件夹
├── router                       // 路由配置文件夹
│   └── index.js                 // 路由配置文件
├── style                        // scss 样式存放目录
│   ├── base                     // 基础样式存放目录
│   │   ├── _base.scss           // 基础样式文件
│   │   ├── _color.scss          // 项目颜色配置变量文件
│   │   ├── _mixin.scss          // scss 混入文件
│   │   └── _reset.scss          // 浏览器初始化文件
│   ├── scss                     // 页面样式文件夹
│   └── style.scss               // 主样式文件
└── utils                        // 常用工具文件夹
     └── index.js                // 常用工具文件
