package bean;

import java.util.List;

public class SongUrl {
    /**
     * req_0 : {"data":{"expiration":80400,"login_key":"","midurlinfo":[{"common_downfromtag":0,"errtype":"","filename":"C400000HjG8v1DTWRO.m4a","flowfromtag":"","flowurl":"","hisbuy":0,"hisdown":0,"isbuy":0,"isonly":0,"onecan":0,"opi128kurl":"","opi192koggurl":"","opi192kurl":"","opi30surl":"","opi48kurl":"","opi96kurl":"","opiflackurl":"","p2pfromtag":0,"pdl":0,"pneed":0,"pneedbuy":0,"premain":0,"purl":"C400000HjG8v1DTWRO.m4a?guid=358840384&vkey=A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB&uin=0&fromtag=66","qmdlfromtag":0,"result":0,"songmid":"001X0PDf0W4lBq","tips":"","uiAlert":0,"vip_downfromtag":0,"vkey":"A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB","wififromtag":"","wifiurl":""}],"msg":"221.4.34.71","retcode":0,"servercheck":"15815ffef7fdad089fdbe8f2f444d252","sip":["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"],"testfile2g":"C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3","thirdip":["",""],"uin":"","verify_type":0},"code":0}
     * code : 0
     * ts : 1573989391788
     */

    private Req0Bean req_0;
    private int code;
    private long ts;
    public int idx;

    public void setIdx(int idx){
        this.idx=idx;
    }

    public Req0Bean getReq_0() {
        return req_0;
    }

    public void setReq_0(Req0Bean req_0) {
        this.req_0 = req_0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public static class Req0Bean {
        /**
         * data : {"expiration":80400,"login_key":"","midurlinfo":[{"common_downfromtag":0,"errtype":"","filename":"C400000HjG8v1DTWRO.m4a","flowfromtag":"","flowurl":"","hisbuy":0,"hisdown":0,"isbuy":0,"isonly":0,"onecan":0,"opi128kurl":"","opi192koggurl":"","opi192kurl":"","opi30surl":"","opi48kurl":"","opi96kurl":"","opiflackurl":"","p2pfromtag":0,"pdl":0,"pneed":0,"pneedbuy":0,"premain":0,"purl":"C400000HjG8v1DTWRO.m4a?guid=358840384&vkey=A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB&uin=0&fromtag=66","qmdlfromtag":0,"result":0,"songmid":"001X0PDf0W4lBq","tips":"","uiAlert":0,"vip_downfromtag":0,"vkey":"A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB","wififromtag":"","wifiurl":""}],"msg":"221.4.34.71","retcode":0,"servercheck":"15815ffef7fdad089fdbe8f2f444d252","sip":["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"],"testfile2g":"C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3","thirdip":["",""],"uin":"","verify_type":0}
         * code : 0
         */

        private DataBean data;
        private int code;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public static class DataBean {
            /**
             * expiration : 80400
             * login_key :
             * midurlinfo : [{"common_downfromtag":0,"errtype":"","filename":"C400000HjG8v1DTWRO.m4a","flowfromtag":"","flowurl":"","hisbuy":0,"hisdown":0,"isbuy":0,"isonly":0,"onecan":0,"opi128kurl":"","opi192koggurl":"","opi192kurl":"","opi30surl":"","opi48kurl":"","opi96kurl":"","opiflackurl":"","p2pfromtag":0,"pdl":0,"pneed":0,"pneedbuy":0,"premain":0,"purl":"C400000HjG8v1DTWRO.m4a?guid=358840384&vkey=A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB&uin=0&fromtag=66","qmdlfromtag":0,"result":0,"songmid":"001X0PDf0W4lBq","tips":"","uiAlert":0,"vip_downfromtag":0,"vkey":"A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB","wififromtag":"","wifiurl":""}]
             * msg : 221.4.34.71
             * retcode : 0
             * servercheck : 15815ffef7fdad089fdbe8f2f444d252
             * sip : ["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"]
             * testfile2g : C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3
             * testfilewifi : C400003mAan70zUy5O.m4a?guid=358840384&vkey=0406F43648F3FDE9C62692C7E6CC6D0E570AF1A2A157D43F25546B61553A22E53D109252C3855FC820BCB1751648089827C096CE7F4D9BE0&uin=&fromtag=3
             * thirdip : ["",""]
             * uin :
             * verify_type : 0
             */

            private int expiration;
            private String login_key;
            private String msg;
            private int retcode;
            private String servercheck;
            private String testfile2g;
            private String testfilewifi;
            private String uin;
            private int verify_type;
            private List<MidurlinfoBean> midurlinfo;
            private List<String> sip;
            private List<String> thirdip;

            public int getExpiration() {
                return expiration;
            }

            public void setExpiration(int expiration) {
                this.expiration = expiration;
            }

            public String getLogin_key() {
                return login_key;
            }

            public void setLogin_key(String login_key) {
                this.login_key = login_key;
            }

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public int getRetcode() {
                return retcode;
            }

            public void setRetcode(int retcode) {
                this.retcode = retcode;
            }

            public String getServercheck() {
                return servercheck;
            }

            public void setServercheck(String servercheck) {
                this.servercheck = servercheck;
            }

            public String getTestfile2g() {
                return testfile2g;
            }

            public void setTestfile2g(String testfile2g) {
                this.testfile2g = testfile2g;
            }

            public String getTestfilewifi() {
                return testfilewifi;
            }

            public void setTestfilewifi(String testfilewifi) {
                this.testfilewifi = testfilewifi;
            }

            public String getUin() {
                return uin;
            }

            public void setUin(String uin) {
                this.uin = uin;
            }

            public int getVerify_type() {
                return verify_type;
            }

            public void setVerify_type(int verify_type) {
                this.verify_type = verify_type;
            }

            public List<MidurlinfoBean> getMidurlinfo() {
                return midurlinfo;
            }

            public void setMidurlinfo(List<MidurlinfoBean> midurlinfo) {
                this.midurlinfo = midurlinfo;
            }

            public List<String> getSip() {
                return sip;
            }

            public void setSip(List<String> sip) {
                this.sip = sip;
            }

            public List<String> getThirdip() {
                return thirdip;
            }

            public void setThirdip(List<String> thirdip) {
                this.thirdip = thirdip;
            }

            public static class MidurlinfoBean {
                /**
                 * common_downfromtag : 0
                 * errtype :
                 * filename : C400000HjG8v1DTWRO.m4a
                 * flowfromtag :
                 * flowurl :
                 * hisbuy : 0
                 * hisdown : 0
                 * isbuy : 0
                 * isonly : 0
                 * onecan : 0
                 * opi128kurl :
                 * opi192koggurl :
                 * opi192kurl :
                 * opi30surl :
                 * opi48kurl :
                 * opi96kurl :
                 * opiflackurl :
                 * p2pfromtag : 0
                 * pdl : 0
                 * pneed : 0
                 * pneedbuy : 0
                 * premain : 0
                 * purl : C400000HjG8v1DTWRO.m4a?guid=358840384&vkey=A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB&uin=0&fromtag=66
                 * qmdlfromtag : 0
                 * result : 0
                 * songmid : 001X0PDf0W4lBq
                 * tips :
                 * uiAlert : 0
                 * vip_downfromtag : 0
                 * vkey : A03592440C1EF8D621D61709BA15EF9A9003021C192194F411F12297E6359B30CDE271DFA33D87BEBE3924664FDFB222C56D220BCF32EBFB
                 * wififromtag :
                 * wifiurl :
                 */

                private int common_downfromtag;
                private String errtype;
                private String filename;
                private String flowfromtag;
                private String flowurl;
                private int hisbuy;
                private int hisdown;
                private int isbuy;
                private int isonly;
                private int onecan;
                private String opi128kurl;
                private String opi192koggurl;
                private String opi192kurl;
                private String opi30surl;
                private String opi48kurl;
                private String opi96kurl;
                private String opiflackurl;
                private int p2pfromtag;
                private int pdl;
                private int pneed;
                private int pneedbuy;
                private int premain;
                private String purl;
                private int qmdlfromtag;
                private int result;
                private String songmid;
                private String tips;
                private int uiAlert;
                private int vip_downfromtag;
                private String vkey;
                private String wififromtag;
                private String wifiurl;

                public int getCommon_downfromtag() {
                    return common_downfromtag;
                }

                public void setCommon_downfromtag(int common_downfromtag) {
                    this.common_downfromtag = common_downfromtag;
                }

                public String getErrtype() {
                    return errtype;
                }

                public void setErrtype(String errtype) {
                    this.errtype = errtype;
                }

                public String getFilename() {
                    return filename;
                }

                public void setFilename(String filename) {
                    this.filename = filename;
                }

                public String getFlowfromtag() {
                    return flowfromtag;
                }

                public void setFlowfromtag(String flowfromtag) {
                    this.flowfromtag = flowfromtag;
                }

                public String getFlowurl() {
                    return flowurl;
                }

                public void setFlowurl(String flowurl) {
                    this.flowurl = flowurl;
                }

                public int getHisbuy() {
                    return hisbuy;
                }

                public void setHisbuy(int hisbuy) {
                    this.hisbuy = hisbuy;
                }

                public int getHisdown() {
                    return hisdown;
                }

                public void setHisdown(int hisdown) {
                    this.hisdown = hisdown;
                }

                public int getIsbuy() {
                    return isbuy;
                }

                public void setIsbuy(int isbuy) {
                    this.isbuy = isbuy;
                }

                public int getIsonly() {
                    return isonly;
                }

                public void setIsonly(int isonly) {
                    this.isonly = isonly;
                }

                public int getOnecan() {
                    return onecan;
                }

                public void setOnecan(int onecan) {
                    this.onecan = onecan;
                }

                public String getOpi128kurl() {
                    return opi128kurl;
                }

                public void setOpi128kurl(String opi128kurl) {
                    this.opi128kurl = opi128kurl;
                }

                public String getOpi192koggurl() {
                    return opi192koggurl;
                }

                public void setOpi192koggurl(String opi192koggurl) {
                    this.opi192koggurl = opi192koggurl;
                }

                public String getOpi192kurl() {
                    return opi192kurl;
                }

                public void setOpi192kurl(String opi192kurl) {
                    this.opi192kurl = opi192kurl;
                }

                public String getOpi30surl() {
                    return opi30surl;
                }

                public void setOpi30surl(String opi30surl) {
                    this.opi30surl = opi30surl;
                }

                public String getOpi48kurl() {
                    return opi48kurl;
                }

                public void setOpi48kurl(String opi48kurl) {
                    this.opi48kurl = opi48kurl;
                }

                public String getOpi96kurl() {
                    return opi96kurl;
                }

                public void setOpi96kurl(String opi96kurl) {
                    this.opi96kurl = opi96kurl;
                }

                public String getOpiflackurl() {
                    return opiflackurl;
                }

                public void setOpiflackurl(String opiflackurl) {
                    this.opiflackurl = opiflackurl;
                }

                public int getP2pfromtag() {
                    return p2pfromtag;
                }

                public void setP2pfromtag(int p2pfromtag) {
                    this.p2pfromtag = p2pfromtag;
                }

                public int getPdl() {
                    return pdl;
                }

                public void setPdl(int pdl) {
                    this.pdl = pdl;
                }

                public int getPneed() {
                    return pneed;
                }

                public void setPneed(int pneed) {
                    this.pneed = pneed;
                }

                public int getPneedbuy() {
                    return pneedbuy;
                }

                public void setPneedbuy(int pneedbuy) {
                    this.pneedbuy = pneedbuy;
                }

                public int getPremain() {
                    return premain;
                }

                public void setPremain(int premain) {
                    this.premain = premain;
                }

                public String getPurl() {
                    return purl;
                }

                public void setPurl(String purl) {
                    this.purl = purl;
                }

                public int getQmdlfromtag() {
                    return qmdlfromtag;
                }

                public void setQmdlfromtag(int qmdlfromtag) {
                    this.qmdlfromtag = qmdlfromtag;
                }

                public int getResult() {
                    return result;
                }

                public void setResult(int result) {
                    this.result = result;
                }

                public String getSongmid() {
                    return songmid;
                }

                public void setSongmid(String songmid) {
                    this.songmid = songmid;
                }

                public String getTips() {
                    return tips;
                }

                public void setTips(String tips) {
                    this.tips = tips;
                }

                public int getUiAlert() {
                    return uiAlert;
                }

                public void setUiAlert(int uiAlert) {
                    this.uiAlert = uiAlert;
                }

                public int getVip_downfromtag() {
                    return vip_downfromtag;
                }

                public void setVip_downfromtag(int vip_downfromtag) {
                    this.vip_downfromtag = vip_downfromtag;
                }

                public String getVkey() {
                    return vkey;
                }

                public void setVkey(String vkey) {
                    this.vkey = vkey;
                }

                public String getWififromtag() {
                    return wififromtag;
                }

                public void setWififromtag(String wififromtag) {
                    this.wififromtag = wififromtag;
                }

                public String getWifiurl() {
                    return wifiurl;
                }

                public void setWifiurl(String wifiurl) {
                    this.wifiurl = wifiurl;
                }
            }
        }
    }
}
