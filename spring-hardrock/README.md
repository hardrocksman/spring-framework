https://www.cnblogs.com/Frankie1980/p/7262868.html


AnnotatedBeanDefinitionReader
    读取注解的Bean定义读取器
ClassPathBeanDefinitionScanner
    扫描指定类路径中注解Bean定义的扫描器

BeanDefinitionRegistryPostProcessor
    加载解析各种bean
BeanFactoryPostProcessor
    bean工厂的bean属性处理容器，说通俗一些就是可以管理我们的bean工厂内所有的beandefinition（未实例化）数据，可以随心所欲的修改属性。
BeanPostProcessor
    BeanPostProcessor在初始化后（注意初始化不包括init方法）执行一些操作
    
    
ImportSelector
    