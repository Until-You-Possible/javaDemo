1:  什么是推荐系统

①： 推荐系统是一种信息过滤，用于预测用户对物品的“评分”，“偏好”
②： 推荐系统产生推荐的列表的方式又两种，协同过滤以及基于内容推荐，或者基于个性化推荐

- 协同过滤方法根据用户的历史行为(比如购买记录，选择，查看记录，评价，挑选等)节合其他用户相似决策建立模型。
这种模型可以用于预测用户对那些物品感兴趣或者可能感兴趣(或者是对物品感兴趣的程度)
- 基于内容推荐 利用一些列有有关物品的离散特征，推荐出具有类似的相似的属性。
- 两种方式也经常混着用

2： 上文中有个概念 离散特征 我们细细剖析下 离散相关的概念

首先对于离散：就是分离，分散的意思。

关于连续特征离散化，维基百科给出的定义是：xxx

在统计学或者机器学习中，离散化是指将连续属性，特征或者变量转换或划分为离散或标称属性/变量/间隔/的过程。

3： 为何要对数据特征进行离散化？
- 算法需要
比如决策树，朴素贝叶斯等算法，都是基于离散型的数据展开的。

- 离散化的特征相对于连续型特征更容易理解，更加接近知识层面的表达。
- 可以有效克服数据中隐藏的缺陷，是模型结果更加稳定。

4： 数据离散化的好处
- 离散特征的增加和减少都很容易，易于模型的快速迭代
- 稀疏向量内乘积运算速度快，计算结果方便存储，容易扩展。
- 离散化后的特征对异常数据有很强的Robust()
- 逻辑回归(对数几率回归)属于广义线性模型，表达能里受限；当变量离散化成N个后，每个变量都有单独的权重，相当于为模型引入了非线性，能够提高模型表达能力，加大拟合
