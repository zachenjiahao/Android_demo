package com.example.dushao.data;

import java.util.List;


public class Result_0 {

    private String data_title;
    private DataDTO data;

    public String getData_title() {
        return data_title;
    }

    public void setData_title(String data_title) {
        this.data_title = data_title;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private String times;
        private String mtime;
        private String cachetime;
        private String gntotal;
        private String deathtotal;
        private String sustotal;
        private String curetotal;
        private String econNum;
        private String heconNum;
        private String asymptomNum;
        private String jwsrNum;
        private AddDailyDTO add_daily;
        private List<JwsrTopDTO> jwsrTop;
        private List<ListDTO> list;
        private OthertotalDTO othertotal;
        private List<OtherlistDTO> otherlist;
        private List<OtherhistorylistDTO> otherhistorylist;
        private List<HistorylistDTO> historylist;
        private List<WorldlistDTO> worldlist;
        private CaseClearCityInfoDTO caseClearCityInfo;

        public String getTimes() {
            return times;
        }

        public void setTimes(String times) {
            this.times = times;
        }

        public String getMtime() {
            return mtime;
        }

        public void setMtime(String mtime) {
            this.mtime = mtime;
        }

        public String getCachetime() {
            return cachetime;
        }

        public void setCachetime(String cachetime) {
            this.cachetime = cachetime;
        }

        public String getGntotal() {
            return gntotal;
        }

        public void setGntotal(String gntotal) {
            this.gntotal = gntotal;
        }

        public String getDeathtotal() {
            return deathtotal;
        }

        public void setDeathtotal(String deathtotal) {
            this.deathtotal = deathtotal;
        }

        public String getSustotal() {
            return sustotal;
        }

        public void setSustotal(String sustotal) {
            this.sustotal = sustotal;
        }

        public String getCuretotal() {
            return curetotal;
        }

        public void setCuretotal(String curetotal) {
            this.curetotal = curetotal;
        }

        public String getEconNum() {
            return econNum;
        }

        public void setEconNum(String econNum) {
            this.econNum = econNum;
        }

        public String getHeconNum() {
            return heconNum;
        }

        public void setHeconNum(String heconNum) {
            this.heconNum = heconNum;
        }

        public String getAsymptomNum() {
            return asymptomNum;
        }

        public void setAsymptomNum(String asymptomNum) {
            this.asymptomNum = asymptomNum;
        }

        public String getJwsrNum() {
            return jwsrNum;
        }

        public void setJwsrNum(String jwsrNum) {
            this.jwsrNum = jwsrNum;
        }

        public AddDailyDTO getAdd_daily() {
            return add_daily;
        }

        public void setAdd_daily(AddDailyDTO add_daily) {
            this.add_daily = add_daily;
        }

        public List<JwsrTopDTO> getJwsrTop() {
            return jwsrTop;
        }

        public void setJwsrTop(List<JwsrTopDTO> jwsrTop) {
            this.jwsrTop = jwsrTop;
        }

        public List<ListDTO> getList() {
            return list;
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public OthertotalDTO getOthertotal() {
            return othertotal;
        }

        public void setOthertotal(OthertotalDTO othertotal) {
            this.othertotal = othertotal;
        }

        public List<OtherlistDTO> getOtherlist() {
            return otherlist;
        }

        public void setOtherlist(List<OtherlistDTO> otherlist) {
            this.otherlist = otherlist;
        }

        public List<OtherhistorylistDTO> getOtherhistorylist() {
            return otherhistorylist;
        }

        public void setOtherhistorylist(List<OtherhistorylistDTO> otherhistorylist) {
            this.otherhistorylist = otherhistorylist;
        }

        public List<HistorylistDTO> getHistorylist() {
            return historylist;
        }

        public void setHistorylist(List<HistorylistDTO> historylist) {
            this.historylist = historylist;
        }

        public List<WorldlistDTO> getWorldlist() {
            return worldlist;
        }

        public void setWorldlist(List<WorldlistDTO> worldlist) {
            this.worldlist = worldlist;
        }

        public CaseClearCityInfoDTO getCaseClearCityInfo() {
            return caseClearCityInfo;
        }

        public void setCaseClearCityInfo(CaseClearCityInfoDTO caseClearCityInfo) {
            this.caseClearCityInfo = caseClearCityInfo;
        }

        public static class AddDailyDTO {
            private Integer addcon;
            private Integer addsus;
            private Integer adddeath;
            private Integer addcure;
            private String wjw_addsus;
            private String addcon_new;
            private String adddeath_new;
            private String addcure_new;
            private String wjw_addsus_new;
            private String addecon_new;
            private String addhecon_new;
            private String addjwsr;
            private String addasymptom;

            public Integer getAddcon() {
                return addcon;
            }

            public void setAddcon(Integer addcon) {
                this.addcon = addcon;
            }

            public Integer getAddsus() {
                return addsus;
            }

            public void setAddsus(Integer addsus) {
                this.addsus = addsus;
            }

            public Integer getAdddeath() {
                return adddeath;
            }

            public void setAdddeath(Integer adddeath) {
                this.adddeath = adddeath;
            }

            public Integer getAddcure() {
                return addcure;
            }

            public void setAddcure(Integer addcure) {
                this.addcure = addcure;
            }

            public String getWjw_addsus() {
                return wjw_addsus;
            }

            public void setWjw_addsus(String wjw_addsus) {
                this.wjw_addsus = wjw_addsus;
            }

            public String getAddcon_new() {
                return addcon_new;
            }

            public void setAddcon_new(String addcon_new) {
                this.addcon_new = addcon_new;
            }

            public String getAdddeath_new() {
                return adddeath_new;
            }

            public void setAdddeath_new(String adddeath_new) {
                this.adddeath_new = adddeath_new;
            }

            public String getAddcure_new() {
                return addcure_new;
            }

            public void setAddcure_new(String addcure_new) {
                this.addcure_new = addcure_new;
            }

            public String getWjw_addsus_new() {
                return wjw_addsus_new;
            }

            public void setWjw_addsus_new(String wjw_addsus_new) {
                this.wjw_addsus_new = wjw_addsus_new;
            }

            public String getAddecon_new() {
                return addecon_new;
            }

            public void setAddecon_new(String addecon_new) {
                this.addecon_new = addecon_new;
            }

            public String getAddhecon_new() {
                return addhecon_new;
            }

            public void setAddhecon_new(String addhecon_new) {
                this.addhecon_new = addhecon_new;
            }

            public String getAddjwsr() {
                return addjwsr;
            }

            public void setAddjwsr(String addjwsr) {
                this.addjwsr = addjwsr;
            }

            public String getAddasymptom() {
                return addasymptom;
            }

            public void setAddasymptom(String addasymptom) {
                this.addasymptom = addasymptom;
            }
        }

        public static class OthertotalDTO {
            private String certain;
            private String uncertain;
            private String die;
            private String recure;
            private String certain_inc;
            private String uncertain_inc;
            private String die_inc;
            private String recure_inc;
            private String ecertain;
            private String ecertain_inc;

            public String getCertain() {
                return certain;
            }

            public void setCertain(String certain) {
                this.certain = certain;
            }

            public String getUncertain() {
                return uncertain;
            }

            public void setUncertain(String uncertain) {
                this.uncertain = uncertain;
            }

            public String getDie() {
                return die;
            }

            public void setDie(String die) {
                this.die = die;
            }

            public String getRecure() {
                return recure;
            }

            public void setRecure(String recure) {
                this.recure = recure;
            }

            public String getCertain_inc() {
                return certain_inc;
            }

            public void setCertain_inc(String certain_inc) {
                this.certain_inc = certain_inc;
            }

            public String getUncertain_inc() {
                return uncertain_inc;
            }

            public void setUncertain_inc(String uncertain_inc) {
                this.uncertain_inc = uncertain_inc;
            }

            public String getDie_inc() {
                return die_inc;
            }

            public void setDie_inc(String die_inc) {
                this.die_inc = die_inc;
            }

            public String getRecure_inc() {
                return recure_inc;
            }

            public void setRecure_inc(String recure_inc) {
                this.recure_inc = recure_inc;
            }

            public String getEcertain() {
                return ecertain;
            }

            public void setEcertain(String ecertain) {
                this.ecertain = ecertain;
            }

            public String getEcertain_inc() {
                return ecertain_inc;
            }

            public void setEcertain_inc(String ecertain_inc) {
                this.ecertain_inc = ecertain_inc;
            }
        }

        public static class CaseClearCityInfoDTO {
            private Integer ljClearCityNum;
            private Integer ljNoClearCityNum;
            private Integer ljCityNum;

            public Integer getLjClearCityNum() {
                return ljClearCityNum;
            }

            public void setLjClearCityNum(Integer ljClearCityNum) {
                this.ljClearCityNum = ljClearCityNum;
            }

            public Integer getLjNoClearCityNum() {
                return ljNoClearCityNum;
            }

            public void setLjNoClearCityNum(Integer ljNoClearCityNum) {
                this.ljNoClearCityNum = ljNoClearCityNum;
            }

            public Integer getLjCityNum() {
                return ljCityNum;
            }

            public void setLjCityNum(Integer ljCityNum) {
                this.ljCityNum = ljCityNum;
            }
        }

        public static class JwsrTopDTO {
            private String jwsrNum;
            private String name;
            private String ename;

            public String getJwsrNum() {
                return jwsrNum;
            }

            public void setJwsrNum(String jwsrNum) {
                this.jwsrNum = jwsrNum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }
        }

        public static class ListDTO {
            private String name;
            private String ename;
            private String value;
            private String conadd;
            private String hejian;
            private String econNum;
            private String susNum;
            private String deathNum;
            private String asymptomNum;
            private String cureNum;
            private String zerodays;
            private String jwsr;
            private String jwsrNum;
            private String showCurData;
            private AdddailyDTO adddaily;
            private List<CityDTO> city;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getConadd() {
                return conadd;
            }

            public void setConadd(String conadd) {
                this.conadd = conadd;
            }

            public String getHejian() {
                return hejian;
            }

            public void setHejian(String hejian) {
                this.hejian = hejian;
            }

            public String getEconNum() {
                return econNum;
            }

            public void setEconNum(String econNum) {
                this.econNum = econNum;
            }

            public String getSusNum() {
                return susNum;
            }

            public void setSusNum(String susNum) {
                this.susNum = susNum;
            }

            public String getDeathNum() {
                return deathNum;
            }

            public void setDeathNum(String deathNum) {
                this.deathNum = deathNum;
            }

            public String getAsymptomNum() {
                return asymptomNum;
            }

            public void setAsymptomNum(String asymptomNum) {
                this.asymptomNum = asymptomNum;
            }

            public String getCureNum() {
                return cureNum;
            }

            public void setCureNum(String cureNum) {
                this.cureNum = cureNum;
            }

            public String getZerodays() {
                return zerodays;
            }

            public void setZerodays(String zerodays) {
                this.zerodays = zerodays;
            }

            public String getJwsr() {
                return jwsr;
            }

            public void setJwsr(String jwsr) {
                this.jwsr = jwsr;
            }

            public String getJwsrNum() {
                return jwsrNum;
            }

            public void setJwsrNum(String jwsrNum) {
                this.jwsrNum = jwsrNum;
            }

            public String getShowCurData() {
                return showCurData;
            }

            public void setShowCurData(String showCurData) {
                this.showCurData = showCurData;
            }

            public AdddailyDTO getAdddaily() {
                return adddaily;
            }

            public void setAdddaily(AdddailyDTO adddaily) {
                this.adddaily = adddaily;
            }

            public List<CityDTO> getCity() {
                return city;
            }

            public void setCity(List<CityDTO> city) {
                this.city = city;
            }

            public static class AdddailyDTO {
                private String conadd;
                private String deathadd;
                private String cureadd;
                private String econadd;
                private String conadd_n;
                private String deathadd_n;
                private String cureadd_n;

                public String getConadd() {
                    return conadd;
                }

                public void setConadd(String conadd) {
                    this.conadd = conadd;
                }

                public String getDeathadd() {
                    return deathadd;
                }

                public void setDeathadd(String deathadd) {
                    this.deathadd = deathadd;
                }

                public String getCureadd() {
                    return cureadd;
                }

                public void setCureadd(String cureadd) {
                    this.cureadd = cureadd;
                }

                public String getEconadd() {
                    return econadd;
                }

                public void setEconadd(String econadd) {
                    this.econadd = econadd;
                }

                public String getConadd_n() {
                    return conadd_n;
                }

                public void setConadd_n(String conadd_n) {
                    this.conadd_n = conadd_n;
                }

                public String getDeathadd_n() {
                    return deathadd_n;
                }

                public void setDeathadd_n(String deathadd_n) {
                    this.deathadd_n = deathadd_n;
                }

                public String getCureadd_n() {
                    return cureadd_n;
                }

                public void setCureadd_n(String cureadd_n) {
                    this.cureadd_n = cureadd_n;
                }
            }

            public static class CityDTO {
                private String name;
                private String conNum;
                private String conadd;
                private String conadd_str;
                private String hejian;
                private String susNum;
                private String cureNum;
                private String deathNum;
                private String mapName;
                private String citycode;
                private String econNum;
                private String zerodays;
                private String jwsr;
                private String asymptomNum;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getConNum() {
                    return conNum;
                }

                public void setConNum(String conNum) {
                    this.conNum = conNum;
                }

                public String getConadd() {
                    return conadd;
                }

                public void setConadd(String conadd) {
                    this.conadd = conadd;
                }

                public String getConadd_str() {
                    return conadd_str;
                }

                public void setConadd_str(String conadd_str) {
                    this.conadd_str = conadd_str;
                }

                public String getHejian() {
                    return hejian;
                }

                public void setHejian(String hejian) {
                    this.hejian = hejian;
                }

                public String getSusNum() {
                    return susNum;
                }

                public void setSusNum(String susNum) {
                    this.susNum = susNum;
                }

                public String getCureNum() {
                    return cureNum;
                }

                public void setCureNum(String cureNum) {
                    this.cureNum = cureNum;
                }

                public String getDeathNum() {
                    return deathNum;
                }

                public void setDeathNum(String deathNum) {
                    this.deathNum = deathNum;
                }

                public String getMapName() {
                    return mapName;
                }

                public void setMapName(String mapName) {
                    this.mapName = mapName;
                }

                public String getCitycode() {
                    return citycode;
                }

                public void setCitycode(String citycode) {
                    this.citycode = citycode;
                }

                public String getEconNum() {
                    return econNum;
                }

                public void setEconNum(String econNum) {
                    this.econNum = econNum;
                }

                public String getZerodays() {
                    return zerodays;
                }

                public void setZerodays(String zerodays) {
                    this.zerodays = zerodays;
                }

                public String getJwsr() {
                    return jwsr;
                }

                public void setJwsr(String jwsr) {
                    this.jwsr = jwsr;
                }

                public String getAsymptomNum() {
                    return asymptomNum;
                }

                public void setAsymptomNum(String asymptomNum) {
                    this.asymptomNum = asymptomNum;
                }
            }
        }

        public static class OtherlistDTO {
            private String conNum;
            private String susNum;
            private String cureNum;
            private String deathNum;
            private String conadd;
            private String susadd;
            private String cureadd;
            private String deathadd;
            private String econNum;
            private String name;
            private String citycode;
            private String value;
            private Integer is_show_entrance;
            private Integer is_show_map;

            public String getConNum() {
                return conNum;
            }

            public void setConNum(String conNum) {
                this.conNum = conNum;
            }

            public String getSusNum() {
                return susNum;
            }

            public void setSusNum(String susNum) {
                this.susNum = susNum;
            }

            public String getCureNum() {
                return cureNum;
            }

            public void setCureNum(String cureNum) {
                this.cureNum = cureNum;
            }

            public String getDeathNum() {
                return deathNum;
            }

            public void setDeathNum(String deathNum) {
                this.deathNum = deathNum;
            }

            public String getConadd() {
                return conadd;
            }

            public void setConadd(String conadd) {
                this.conadd = conadd;
            }

            public String getSusadd() {
                return susadd;
            }

            public void setSusadd(String susadd) {
                this.susadd = susadd;
            }

            public String getCureadd() {
                return cureadd;
            }

            public void setCureadd(String cureadd) {
                this.cureadd = cureadd;
            }

            public String getDeathadd() {
                return deathadd;
            }

            public void setDeathadd(String deathadd) {
                this.deathadd = deathadd;
            }

            public String getEconNum() {
                return econNum;
            }

            public void setEconNum(String econNum) {
                this.econNum = econNum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCitycode() {
                return citycode;
            }

            public void setCitycode(String citycode) {
                this.citycode = citycode;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public Integer getIs_show_entrance() {
                return is_show_entrance;
            }

            public void setIs_show_entrance(Integer is_show_entrance) {
                this.is_show_entrance = is_show_entrance;
            }

            public Integer getIs_show_map() {
                return is_show_map;
            }

            public void setIs_show_map(Integer is_show_map) {
                this.is_show_map = is_show_map;
            }
        }

        public static class OtherhistorylistDTO {
            private String certain;
            private String uncertain;
            private String die;
            private String recure;
            private String certain_inc;
            private String uncertain_inc;
            private String die_inc;
            private String recure_inc;
            private String date;

            public String getCertain() {
                return certain;
            }

            public void setCertain(String certain) {
                this.certain = certain;
            }

            public String getUncertain() {
                return uncertain;
            }

            public void setUncertain(String uncertain) {
                this.uncertain = uncertain;
            }

            public String getDie() {
                return die;
            }

            public void setDie(String die) {
                this.die = die;
            }

            public String getRecure() {
                return recure;
            }

            public void setRecure(String recure) {
                this.recure = recure;
            }

            public String getCertain_inc() {
                return certain_inc;
            }

            public void setCertain_inc(String certain_inc) {
                this.certain_inc = certain_inc;
            }

            public String getUncertain_inc() {
                return uncertain_inc;
            }

            public void setUncertain_inc(String uncertain_inc) {
                this.uncertain_inc = uncertain_inc;
            }

            public String getDie_inc() {
                return die_inc;
            }

            public void setDie_inc(String die_inc) {
                this.die_inc = die_inc;
            }

            public String getRecure_inc() {
                return recure_inc;
            }

            public void setRecure_inc(String recure_inc) {
                this.recure_inc = recure_inc;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class HistorylistDTO {
            private String date;
            private String cn_conNum;
            private String cn_deathNum;
            private String cn_cureNum;
            private String cn_susNum;
            private String cn_econNum;
            private String cn_heconNum;
            private String cn_deathRate;
            private String cn_cureRate;
            private String is_show;
            private String wjw_susNum;
            private String wuhan_conNum;
            private String wuhan_deathNum;
            private String wuhan_cureNum;
            private Object wuhan_susNum;
            private String cn_conadd;
            private String cn_jwsrNum;
            private String cn_addjwsrNum;
            private String cn_asymptomNum;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCn_conNum() {
                return cn_conNum;
            }

            public void setCn_conNum(String cn_conNum) {
                this.cn_conNum = cn_conNum;
            }

            public String getCn_deathNum() {
                return cn_deathNum;
            }

            public void setCn_deathNum(String cn_deathNum) {
                this.cn_deathNum = cn_deathNum;
            }

            public String getCn_cureNum() {
                return cn_cureNum;
            }

            public void setCn_cureNum(String cn_cureNum) {
                this.cn_cureNum = cn_cureNum;
            }

            public String getCn_susNum() {
                return cn_susNum;
            }

            public void setCn_susNum(String cn_susNum) {
                this.cn_susNum = cn_susNum;
            }

            public String getCn_econNum() {
                return cn_econNum;
            }

            public void setCn_econNum(String cn_econNum) {
                this.cn_econNum = cn_econNum;
            }

            public String getCn_heconNum() {
                return cn_heconNum;
            }

            public void setCn_heconNum(String cn_heconNum) {
                this.cn_heconNum = cn_heconNum;
            }

            public String getCn_deathRate() {
                return cn_deathRate;
            }

            public void setCn_deathRate(String cn_deathRate) {
                this.cn_deathRate = cn_deathRate;
            }

            public String getCn_cureRate() {
                return cn_cureRate;
            }

            public void setCn_cureRate(String cn_cureRate) {
                this.cn_cureRate = cn_cureRate;
            }

            public String getIs_show() {
                return is_show;
            }

            public void setIs_show(String is_show) {
                this.is_show = is_show;
            }

            public String getWjw_susNum() {
                return wjw_susNum;
            }

            public void setWjw_susNum(String wjw_susNum) {
                this.wjw_susNum = wjw_susNum;
            }

            public String getWuhan_conNum() {
                return wuhan_conNum;
            }

            public void setWuhan_conNum(String wuhan_conNum) {
                this.wuhan_conNum = wuhan_conNum;
            }

            public String getWuhan_deathNum() {
                return wuhan_deathNum;
            }

            public void setWuhan_deathNum(String wuhan_deathNum) {
                this.wuhan_deathNum = wuhan_deathNum;
            }

            public String getWuhan_cureNum() {
                return wuhan_cureNum;
            }

            public void setWuhan_cureNum(String wuhan_cureNum) {
                this.wuhan_cureNum = wuhan_cureNum;
            }

            public Object getWuhan_susNum() {
                return wuhan_susNum;
            }

            public void setWuhan_susNum(Object wuhan_susNum) {
                this.wuhan_susNum = wuhan_susNum;
            }

            public String getCn_conadd() {
                return cn_conadd;
            }

            public void setCn_conadd(String cn_conadd) {
                this.cn_conadd = cn_conadd;
            }

            public String getCn_jwsrNum() {
                return cn_jwsrNum;
            }

            public void setCn_jwsrNum(String cn_jwsrNum) {
                this.cn_jwsrNum = cn_jwsrNum;
            }

            public String getCn_addjwsrNum() {
                return cn_addjwsrNum;
            }

            public void setCn_addjwsrNum(String cn_addjwsrNum) {
                this.cn_addjwsrNum = cn_addjwsrNum;
            }

            public String getCn_asymptomNum() {
                return cn_asymptomNum;
            }

            public void setCn_asymptomNum(String cn_asymptomNum) {
                this.cn_asymptomNum = cn_asymptomNum;
            }
        }

        public static class WorldlistDTO {
            private String name;
            private String value;//累计确诊
            private String susNum;
            private String deathNum;//死亡人数
            private String cureNum;//治愈人数
            private String econNum;//现存确诊
            private String conNum;
            private String conadd;
            private String susadd;
            private String cureadd;//新增治愈
            private String deathadd;//新增死亡
            private String citycode;
            private Integer is_show_entrance;
            private Integer is_show_map;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getSusNum() {
                return susNum;
            }

            public void setSusNum(String susNum) {
                this.susNum = susNum;
            }

            public String getDeathNum() {
                return deathNum;
            }

            public void setDeathNum(String deathNum) {
                this.deathNum = deathNum;
            }

            public String getCureNum() {
                return cureNum;
            }

            public void setCureNum(String cureNum) {
                this.cureNum = cureNum;
            }

            public String getEconNum() {
                return econNum;
            }

            public void setEconNum(String econNum) {
                this.econNum = econNum;
            }

            public String getConNum() {
                return conNum;
            }

            public void setConNum(String conNum) {
                this.conNum = conNum;
            }

            public String getConadd() {
                return conadd;
            }

            public void setConadd(String conadd) {
                this.conadd = conadd;
            }

            public String getSusadd() {
                return susadd;
            }

            public void setSusadd(String susadd) {
                this.susadd = susadd;
            }

            public String getCureadd() {
                return cureadd;
            }

            public void setCureadd(String cureadd) {
                this.cureadd = cureadd;
            }

            public String getDeathadd() {
                return deathadd;
            }

            public void setDeathadd(String deathadd) {
                this.deathadd = deathadd;
            }

            public String getCitycode() {
                return citycode;
            }

            public void setCitycode(String citycode) {
                this.citycode = citycode;
            }

            public Integer getIs_show_entrance() {
                return is_show_entrance;
            }

            public void setIs_show_entrance(Integer is_show_entrance) {
                this.is_show_entrance = is_show_entrance;
            }

            public Integer getIs_show_map() {
                return is_show_map;
            }

            public void setIs_show_map(Integer is_show_map) {
                this.is_show_map = is_show_map;
            }
        }
    }
}
