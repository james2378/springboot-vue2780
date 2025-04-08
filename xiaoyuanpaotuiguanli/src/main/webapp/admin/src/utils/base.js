const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanpaotuiguanli/",
            name: "xiaoyuanpaotuiguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanpaotuiguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园跑腿管理系统"
        } 
    }
}
export default base
