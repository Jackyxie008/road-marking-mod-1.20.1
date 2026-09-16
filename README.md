# 🌍 Interactive World News Map (互动式世界地图新闻展示网站)

一个基于 **Vue 3**、**Leaflet** 与 **Python** 构建的自动化全球新闻地图可视化平台。系统通过 RSS 异步抓取全球多源新闻，利用向量余弦相似度进行内容聚类，配合改进的 Hacker News 热度算法与大语言模型（LLM），实现新闻的精准定位、多视角聚合与动态热度渲染。

---

## 🌟 核心特性

* **🗺️ 动态地图交互**：基于 Leaflet.js 实现全球新闻点位的可视化渲染，支持缩放、聚合与多维筛选。
* **⚡ 高效数据采集**：利用 `asyncio` 与 `trafilatura` 配合 RSS 协议，实现多源新闻的高并发、低延迟抓取。
* **🧠 智能新闻聚类**：采用 `SentenceTransformer` 计算文本**余弦相似度（Cosine Similarity）**，毫秒级合并不同媒体对同一事件的重复报道，打破信息孤岛。
* **🔥 动态热度算法**：改进 Hacker News 排名公式，引入**信源声誉值（Reputation）**与衰减缓冲因子 $(T+2)^{1.8}$，兼顾新闻时效性与权威度。
* **🏷️ LLM 精准解析与分类**：接入大模型 API，结合 Prompt 工程实现新闻中英文摘要提取及 13 分类自动标注。
* **🛡️ 渐进式坐标容错**：内置渐进式地理编码搜索算法（地标 → 城市 → 国家），确保新闻点位精准降级显示。
* **⚙️ 灵活配置管理**：采用 JSON 配置文件（数据与逻辑分离），支持新闻源与系统参数的热更新。

---

## 📐 算法原理

### 1. 新闻热度计算公式 (Heat Algorithm)

系统采用改进的 Hacker News 排名衰减模型计算新闻热度值：

$$\text{Heat} = \frac{\sum \text{Reputation}}{(T + 2)^{1.8}}$$

* **$\sum \text{Reputation}$**：聚合事件中所有报道媒体的初始声誉权重总和。
* **$T$**：新闻发布至今的时间差距（单位：小时）。
* **$+2$**：平滑缓冲因子，避免新发资讯热度过快塌陷。
* **$1.8$**：重力系数，控制热度随时间的衰减速率。

### 2. 余弦相似度聚类 (Cosine Similarity)

通过向量模型将新闻文本转化为嵌入向量，利用向量夹角余弦值判断语义相似度：

$$\text{Similarity} = \cos(\theta) = \frac{\mathbf{A} \cdot \mathbf{B}}{\Vert{}\mathbf{A}\Vert{} \Vert{}\mathbf{B}\Vert{}}$$

当相似度高于设定阈值时，自动将报道归并至同一地图坐标点，并整合多视角报道。

---

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

