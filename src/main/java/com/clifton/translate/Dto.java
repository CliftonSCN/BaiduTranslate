package com.clifton.translate;

import java.util.List;

/**
 * @author Clifton
 * @create 2021/2/7 - 14:07
 */
public class Dto {
    String from;
    String to;
    List<res> transResult;


    class res {
        String src;
        String dst;

        @Override
        public String toString() {
            return "res{" +
                    "src='" + src + '\'' +
                    ", dst='" + dst + '\'' +
                    '}';
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getDst() {
            return dst;
        }

        public void setDst(String dst) {
            this.dst = dst;
        }
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<res> getTransResult() {
        return transResult;
    }

    public void setTransResult(List<res> transResult) {
        this.transResult = transResult;
    }
}
