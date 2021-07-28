package com.example.dushao.data;

import java.io.Serializable;
import java.util.List;

public class Result_1 implements Serializable {

    private 索引条件DTO 索引条件;
    private String 索引状态;
    private String 索引总数量;

    public 索引条件DTO get索引条件() {
        return 索引条件;
    }

    public void set索引条件(索引条件DTO 索引条件) {
        this.索引条件 = 索引条件;
    }

    public String get索引状态() {
        return 索引状态;
    }

    public void set索引状态(String 索引状态) {
        this.索引状态 = 索引状态;
    }

    public String get索引总数量() {
        return 索引总数量;
    }

    public void set索引总数量(String 索引总数量) {
        this.索引总数量 = 索引总数量;
    }

    public String get索引总页数() {
        return 索引总页数;
    }

    public void set索引总页数(String 索引总页数) {
        this.索引总页数 = 索引总页数;
    }

    public String get索引页容量() {
        return 索引页容量;
    }

    public void set索引页容量(String 索引页容量) {
        this.索引页容量 = 索引页容量;
    }

    public String get索引页序号() {
        return 索引页序号;
    }

    public void set索引页序号(String 索引页序号) {
        this.索引页序号 = 索引页序号;
    }

    public List<索引实体信息DTO> get索引实体信息() {
        return 索引实体信息;
    }

    public void set索引实体信息(List<索引实体信息DTO> 索引实体信息) {
        this.索引实体信息 = 索引实体信息;
    }

    private String 索引总页数;
    private String 索引页容量;
    private String 索引页序号;
    private List<索引实体信息DTO> 索引实体信息;

    public static class 索引条件DTO implements Serializable {
        private String 索引字符串;
    }

    public static class 索引实体信息DTO implements Serializable {
        private String 数据编码;
        private String 疾病名称;
        private String 疾病别名;
        private String 疾病详情;
        private String 是否医保范畴;

        public String get数据编码() {
            return 数据编码;
        }

        public void set数据编码(String 数据编码) {
            this.数据编码 = 数据编码;
        }

        public String get疾病名称() {
            return 疾病名称;
        }

        public void set疾病名称(String 疾病名称) {
            this.疾病名称 = 疾病名称;
        }

        public String get疾病别名() {
            return 疾病别名;
        }

        public void set疾病别名(String 疾病别名) {
            this.疾病别名 = 疾病别名;
        }

        public String get疾病详情() {
            return 疾病详情;
        }

        public void set疾病详情(String 疾病详情) {
            this.疾病详情 = 疾病详情;
        }

        public String get是否医保范畴() {
            return 是否医保范畴;
        }

        public void set是否医保范畴(String 是否医保范畴) {
            this.是否医保范畴 = 是否医保范畴;
        }

        public String get发病部位() {
            return 发病部位;
        }

        public void set发病部位(String 发病部位) {
            this.发病部位 = 发病部位;
        }

        public String get传染性() {
            return 传染性;
        }

        public void set传染性(String 传染性) {
            this.传染性 = 传染性;
        }

        public String get多发人群() {
            return 多发人群;
        }

        public void set多发人群(String 多发人群) {
            this.多发人群 = 多发人群;
        }

        public String get相关症状() {
            return 相关症状;
        }

        public void set相关症状(String 相关症状) {
            this.相关症状 = 相关症状;
        }

        public String get并发疾病() {
            return 并发疾病;
        }

        public void set并发疾病(String 并发疾病) {
            this.并发疾病 = 并发疾病;
        }

        public String get就诊科室() {
            return 就诊科室;
        }

        public void set就诊科室(String 就诊科室) {
            this.就诊科室 = 就诊科室;
        }

        public String get治疗费用() {
            return 治疗费用;
        }

        public void set治疗费用(String 治疗费用) {
            this.治疗费用 = 治疗费用;
        }

        public String get治愈率() {
            return 治愈率;
        }

        public void set治愈率(String 治愈率) {
            this.治愈率 = 治愈率;
        }

        public String get治疗周期() {
            return 治疗周期;
        }

        public void set治疗周期(String 治疗周期) {
            this.治疗周期 = 治疗周期;
        }

        public String get治疗方法() {
            return 治疗方法;
        }

        public void set治疗方法(String 治疗方法) {
            this.治疗方法 = 治疗方法;
        }

        public String get相关检查() {
            return 相关检查;
        }

        public void set相关检查(String 相关检查) {
            this.相关检查 = 相关检查;
        }

        public String get相关手术() {
            return 相关手术;
        }

        public void set相关手术(String 相关手术) {
            this.相关手术 = 相关手术;
        }

        public String get常用药品() {
            return 常用药品;
        }

        public void set常用药品(String 常用药品) {
            this.常用药品 = 常用药品;
        }

        public String get最佳就诊时间() {
            return 最佳就诊时间;
        }

        public void set最佳就诊时间(String 最佳就诊时间) {
            this.最佳就诊时间 = 最佳就诊时间;
        }

        public String get就诊前准备() {
            return 就诊前准备;
        }

        public void set就诊前准备(String 就诊前准备) {
            this.就诊前准备 = 就诊前准备;
        }

        public String get传播途径() {
            return 传播途径;
        }

        public void set传播途径(String 传播途径) {
            this.传播途径 = 传播途径;
        }

        public String get传染病种类() {
            return 传染病种类;
        }

        public void set传染病种类(String 传染病种类) {
            this.传染病种类 = 传染病种类;
        }

        public String get潜伏期() {
            return 潜伏期;
        }

        public void set潜伏期(String 潜伏期) {
            this.潜伏期 = 潜伏期;
        }

        public String get遗传方式() {
            return 遗传方式;
        }

        public void set遗传方式(String 遗传方式) {
            this.遗传方式 = 遗传方式;
        }

        public String get是否会遗传() {
            return 是否会遗传;
        }

        public void set是否会遗传(String 是否会遗传) {
            this.是否会遗传 = 是否会遗传;
        }

        public String get潜伏期表现() {
            return 潜伏期表现;
        }

        public void set潜伏期表现(String 潜伏期表现) {
            this.潜伏期表现 = 潜伏期表现;
        }

        private String 发病部位;
        private String 传染性;
        private String 多发人群;
        private String 相关症状;
        private String 并发疾病;
        private String 就诊科室;
        private String 治疗费用;
        private String 治愈率;
        private String 治疗周期;
        private String 治疗方法;
        private String 相关检查;
        private String 相关手术;
        private String 常用药品;
        private String 最佳就诊时间;
        private String 就诊前准备;
        private String 传播途径;
        private String 传染病种类;
        private String 潜伏期;
        private String 遗传方式;
        private String 是否会遗传;
        private String 潜伏期表现;
    }
}
