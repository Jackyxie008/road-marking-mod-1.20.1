# 🌍 Interactive World News Map (互动式世界地图新闻展示网站)

一个基于 **Vue 3**、**Leaflet** 与 **Python** 构建的自动化全球新闻地图可视化平台。系统通过 RSS 异步抓取全球多源新闻，利用向量余弦相似度进行内容聚类，配合改进的 Hacker News 热度算法与大语言模型（LLM），实现新闻的精准定位、多视角聚合与动态热度渲染。

详情请看docs

---

##使用方法

###后端

先在.env里写入API KEY。

在backend/data/platforms.json里可以增减API平台。

在backend\crawlers\feeds.json里可以增减新闻RSS。

然后运行backend/main.py。

###前端

先运行backend/api_server.py启动数据库，

再在另一个终端输入：
cd frontend
npm run dev

