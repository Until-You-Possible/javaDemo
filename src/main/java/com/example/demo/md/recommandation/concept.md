1:  什么是推荐系统

①： 推荐系统是一种信息过滤，用于预测用户对物品的“评分”，“偏好”
②： 推荐系统产生推荐的列表的方式又两种，协同过滤以及基于内容推荐，或者基于个性化推荐

- 协同过滤方法根据用户的历史行为(比如购买记录，选择，查看记录，评价，挑选等)节合其他用户相似决策建立模型。
这种模型可以用于预测用户对那些物品感兴趣或者可能感兴趣(或者是对物品感兴趣的程度)
- 基于内容推荐 利用一些列有有关物品的离散特征，推荐出具有类似的相似的属性。
- 两种方式也经常混着用

2： 上文中有个概念 离散特征 我们细细剖析下 离散相关的概念

首先对于离散：就是分离，分散的意思。

关于连续特征离散化，维基百科给出的定义是：

在统计学或者机器学习中，离散化是指将连续属性，特征或者变量转换或划分为离散或标称属性/变量/间隔/的过程。

3： 为何要对数据特征进行离散化？