package com.bwie.month1024.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric on 2018/10/24.
 */

public class Food {
    private int status;
    private String message;
    private ArrayList<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<DataBean> getData() {
        return data;
    }

    public void setData(ArrayList<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private int id;
        private String name;
        @SerializedName("restaurant_id")
        private int restaurantId;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("__v")
        private int v;
        private ArrayList<SpusBean> spus;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRestaurantId() {
            return restaurantId;
        }

        public void setRestaurantId(int restaurantId) {
            this.restaurantId = restaurantId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        public ArrayList<SpusBean> getSpus() {
            return spus;
        }

        public void setSpus(ArrayList<SpusBean> spus) {
            this.spus = spus;
        }

        public static class SpusBean implements Serializable {
            /**
             * _id : 5ac5b0913714cc2d644f461e
             * id : 1089
             * restaurant_id : 32
             * category_id : 143
             * name : 套餐8：海苔鸡肉卷+辣翅+可乐
             * praise_num : 49
             * praise_content : 好吃
             * month_saled : 1
             * month_saled_content : 1
             * pic_url : http://p1.meituan.net/wmproduct/735b78e97285214f1e8c62346546e92052099.jpg
             * __v : 0
             * created_at : 2018-04-05T05:08:44.549Z
             * skus : [{"description":"","price":"20.8","id":1090,"_id":"5ac5b0913714cc2d644f461f"}]
             * attrs : []
             * status_remind_list : []
             */

            private String _id;
            private int id;
            @SerializedName("restaurant_id")
            private int restaurantId;
            @SerializedName("category_id")
            private int categoryId;
            private String name;
            @SerializedName("praise_num")
            private int praiseNum;
            private String praise_content;
            @SerializedName("month_saled")
            private int monthSaled;
            @SerializedName("month_saled_content")
            private String monthSaledContent;
            @SerializedName("pic_url")
            private String picUrl;
            @SerializedName("__v")
            private int v;
            @SerializedName("created_at")
            private String createdAt;
            private List<SkusBean> skus;
            private int num;

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getRestaurantId() {
                return restaurantId;
            }

            public void setRestaurantId(int restaurantId) {
                this.restaurantId = restaurantId;
            }

            public int getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(int categoryId) {
                this.categoryId = categoryId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(int praiseNum) {
                this.praiseNum = praiseNum;
            }

            public String getPraise_content() {
                return praise_content;
            }

            public void setPraise_content(String praise_content) {
                this.praise_content = praise_content;
            }

            public int getMonthSaled() {
                return monthSaled;
            }

            public void setMonthSaled(int monthSaled) {
                this.monthSaled = monthSaled;
            }

            public String getMonthSaledContent() {
                return monthSaledContent;
            }

            public void setMonthSaledContent(String monthSaledContent) {
                this.monthSaledContent = monthSaledContent;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public int getV() {
                return v;
            }

            public void setV(int v) {
                this.v = v;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public List<SkusBean> getSkus() {
                return skus;
            }

            public void setSkus(List<SkusBean> skus) {
                this.skus = skus;
            }

            public static class SkusBean {
                /**
                 * description :
                 * price : 20.8
                 * id : 1090
                 * _id : 5ac5b0913714cc2d644f461f
                 */

                private String description;
                private String price;
                private int id;
                private String _id;

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }
            }
        }
    }
}
