// 导航栏配置文件
var outlookbar=new outlook();
var t;
t=outlookbar.addtitle('基本设置','知识管理',1)
outlookbar.additem('添加论坛',t,'preaddforum.action')
outlookbar.additem('所有论坛',t,'listforum.action')
outlookbar.additem('更改登录密码',t,'chanagepass.html')
outlookbar.additem('添加知识分类',t,'preaddbaiketype.action')
outlookbar.additem('所有知识分类',t,'listbaiketype.action')
outlookbar.additem('添加知识',t,'preaddbaike.action')
outlookbar.additem('所有知识',t,'listbaike.action')

t=outlookbar.addtitle('文章管理','文章管理',1)
outlookbar.additem('缓存中的文章文章',t,'listcache.action')
outlookbar.additem('系统中所有文章类型',t,'listarticletype.action')
outlookbar.additem('添加文章类型',t,'preaddarticletype.action')
outlookbar.additem('撰写最新文章',t,'preaddarticle.action')
outlookbar.additem('添加微博',t,'preaddminiarticle.action')
outlookbar.additem('所有微博',t,'listminiarticle.action')
outlookbar.additem('系统中所有文章',t,'listarticle.action')

t=outlookbar.addtitle('广告设置','易货管理',1)
outlookbar.additem('登录文学论坛',t,'../vbb/forumdisplay.php?s=320e689ffabc5daa0be8b02c284d9968&forumid=39')
outlookbar.additem('发出电子邮件',t,'mailto:pobear@newmail.dlmu.edu.cn')

t=outlookbar.addtitle('新闻设置','广告新闻',1)
outlookbar.additem('尚未通过文章',t,'un_pass.php')
outlookbar.additem('已经通过文章',t,'al_pass.php')
outlookbar.additem('修改现有文章',t,'modify.php')
outlookbar.additem('撰写最新文章',t,'sub_new.php')
outlookbar.additem('投稿给文学报',t,'#')
//preaddarticle
t=outlookbar.addtitle('新闻设置','账户管理',1)
outlookbar.additem('尚未通过文章',t,'un_pass.php')
outlookbar.additem('已经通过文章',t,'al_pass.php')
outlookbar.additem('修改现有文章',t,'modify.php')
outlookbar.additem('撰写最新文章',t,'sub_new.php')
outlookbar.additem('投稿给文学报',t,'#')

t=outlookbar.addtitle('退出系统','管理首页',1)
outlookbar.additem('点击退出登录',t,'loginout.php')
outlookbar.additem('点击f退出登录',t,'loginout.php')
outlookbar.additem('点击f退出登录',t,'loginout.php')