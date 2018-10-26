package com.bwie.month1024.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by eric on 2018/10/24.
 */

public class Restaurant {

    /**
     * status : 200
     * message : 获取餐馆列表成功
     * data : [{"_id":"5ac5af803714cc2d644f4615","id":32,"name":"麦当当的店","month_sales":194,"month_sales_tip":"月售194笔","wm_poi_score":3,"delivery_score":2.1,"quality_score":3.7,"pack_score":4.1,"food_score":1.1,"delivery_time_tip":"1525.9分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/fdd295e7650587269e0f1d7c35ba180c114177.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":10,"min_price_tip":"起送 ￥10","shipping_fee":0,"shipping_fee_tip":"配送 ￥0","bulletin":"理工短号615592（原大学生粗粮坊）做你身边最快的外卖！","address":"东莞市大岭山镇元岭村翠园街7巷20号102铺","call_center":"15916985301","distance":"2146.3km","average_price_tip":"人均20","comment_number":53,"lng":"113.854074","lat":"22.901119","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5b4383714cc2d644f4696","id":33,"name":"伏牛炸鸡汉堡","month_sales":173,"month_sales_tip":"月售173笔","wm_poi_score":1.6,"delivery_score":3.1,"quality_score":1.3,"pack_score":1.8,"food_score":0.7,"delivery_time_tip":"1525.4分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/55493399bb1c6e4884ff9456f92a391119693.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":10,"min_price_tip":"起送 ￥10","shipping_fee":0,"shipping_fee_tip":"配送 ￥0","bulletin":"理工专送，新旧男生宿舍下单都送到宿舍楼上。女生下楼领取。1点半到4点接受预订单。","address":"东莞市大岭山镇元岭村元岭综合市场1140号铺位","call_center":"15024098870","distance":"2146.2km","average_price_tip":"人均20","comment_number":50,"lng":"113.854364","lat":"22.902121","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5b7fb3714cc2d644f4756","id":35,"name":"潇湘粤语（东城万达店）","month_sales":28,"month_sales_tip":"月售28笔","wm_poi_score":2,"delivery_score":3.5,"quality_score":0.5,"pack_score":0.8,"food_score":1.6,"delivery_time_tip":"1521.1分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/4f5897d268ec95176d8afd4bf6e8a7252376.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":20,"min_price_tip":"起送 ￥20","shipping_fee":4,"shipping_fee_tip":"配送 ￥4","bulletin":"亲，记得点米饭哦！！\n 即日起：凡在本店下单送免费小吃一份\n               订单满200元送水果一份","address":"东城区万达广场室内步行街三层3016","call_center":"076987006660","distance":"2169.6km","average_price_tip":"人均20","comment_number":45,"lng":"113.780507","lat":"23.034935","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]},{"_id":"5ac5ba2f3714cc2d644f47f1","id":36,"name":"麦当劳（东城万达店）","month_sales":32,"month_sales_tip":"月售32笔","wm_poi_score":2.8,"delivery_score":2.8,"quality_score":3.4,"pack_score":3.6,"food_score":0.3,"delivery_time_tip":"1520.1分钟","third_category":"中式简餐","pic_url":"http://p0.meituan.net/xianfu/851a8deb169f4f8aab16a7688932328f5634.jpg","shopping_time_start":"8:00","shopping_time_end":"24:00","min_price":20,"min_price_tip":"起送 ￥20","shipping_fee":3,"shipping_fee_tip":"配送 ￥3","bulletin":"欢迎下单","address":"东城区东纵大道万达广场2楼2027/2028号商铺","call_center":"0769-83785043","distance":"2164.0km","average_price_tip":"人均20","comment_number":41,"lng":"113.779576","lat":"23.035256","__v":0,"created_at":"2018-04-05T05:08:44.533Z","discounts2":[{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * _id : 5ac5af803714cc2d644f4615
         * id : 32
         * name : 麦当当的店
         * month_sales : 194
         * month_sales_tip : 月售194笔
         * wm_poi_score : 3
         * delivery_score : 2.1
         * quality_score : 3.7
         * pack_score : 4.1
         * food_score : 1.1
         * delivery_time_tip : 1525.9分钟
         * third_category : 中式简餐
         * pic_url : http://p0.meituan.net/xianfu/fdd295e7650587269e0f1d7c35ba180c114177.jpg
         * shopping_time_start : 8:00
         * shopping_time_end : 24:00
         * min_price : 10
         * min_price_tip : 起送 ￥10
         * shipping_fee : 0
         * shipping_fee_tip : 配送 ￥0
         * bulletin : 理工短号615592（原大学生粗粮坊）做你身边最快的外卖！
         * address : 东莞市大岭山镇元岭村翠园街7巷20号102铺
         * call_center : 15916985301
         * distance : 2146.3km
         * average_price_tip : 人均20
         * comment_number : 53
         * lng : 113.854074
         * lat : 22.901119
         * __v : 0
         * created_at : 2018-04-05T05:08:44.533Z
         * discounts2 : [{"info":"满20减18;满45减40;满60减53","icon_url":"http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png","promotion_type":2},{"info":"折扣商品7.33折起","icon_url":"http://p1.meituan.net/xianfu/9c997ecce6150671b8459738a26f8bd9767.png","promotion_type":2},{"info":"新用户立减2元,首次使用银行卡支付最高再减3元","icon_url":"http://p0.meituan.net/xianfu/019d1bbb1310b1531e6af6172c9a5095581.png","promotion_type":2}]
         */

        private String _id;
        private int id;
        private String name;
        @SerializedName("month_sales")
        private int monthSales;
        @SerializedName("month_sales_tip")
        private String monthSalesTip;
        @SerializedName("wm_poi_score")
        private float wmPoiScore;
        @SerializedName("delivery_score")
        private float deliveryScore;
        @SerializedName("quality_score")
        private float qualityScore;
        @SerializedName("pack_score")
        private float packScore;
        @SerializedName("food_score")
        private float foodScore;
        @SerializedName("delivery_time_tip")
        private String deliveryTimeTip;
        @SerializedName("third_category")
        private String thirdCategory;
        @SerializedName("pic_url")
        private String picUrl;
        @SerializedName("shopping_time_start")
        private String shoppingTimeStar;
        @SerializedName("shopping_time_end")
        private String shoppingTimeEnd;
        @SerializedName("min_price")
        private int minPrice;
        @SerializedName("min_price_tip")
        private String minPriceTip;
        @SerializedName("shipping_fee")
        private int shippingFee;
        @SerializedName("shipping_fee_tip")
        private String shippingFeeTip;
        private String bulletin;
        private String address;
        @SerializedName("call_center")
        private String callCenter;
        private String distance;
        @SerializedName("average_price_tip")
        private String averagePriceTip;
        @SerializedName("comment_number")
        private int commentNumber;
        private String lng;
        private String lat;
        @SerializedName("__v")
        private int v;
        @SerializedName("created_at")
        private String createdAt;
        private List<Discounts2Bean> discounts2;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMonthSales() {
            return monthSales;
        }

        public void setMonthSales(int monthSales) {
            this.monthSales = monthSales;
        }

        public String getMonthSalesTip() {
            return monthSalesTip;
        }

        public void setMonthSalesTip(String monthSalesTip) {
            this.monthSalesTip = monthSalesTip;
        }

        public float getWmPoiScore() {
            return wmPoiScore;
        }

        public void setWmPoiScore(float wmPoiScore) {
            this.wmPoiScore = wmPoiScore;
        }

        public float getDeliveryScore() {
            return deliveryScore;
        }

        public void setDeliveryScore(float deliveryScore) {
            this.deliveryScore = deliveryScore;
        }

        public float getQualityScore() {
            return qualityScore;
        }

        public void setQualityScore(float qualityScore) {
            this.qualityScore = qualityScore;
        }

        public float getPackScore() {
            return packScore;
        }

        public void setPackScore(float packScore) {
            this.packScore = packScore;
        }

        public float getFoodScore() {
            return foodScore;
        }

        public void setFoodScore(float foodScore) {
            this.foodScore = foodScore;
        }

        public String getDeliveryTimeTip() {
            return deliveryTimeTip;
        }

        public void setDeliveryTimeTip(String deliveryTimeTip) {
            this.deliveryTimeTip = deliveryTimeTip;
        }

        public String getThirdCategory() {
            return thirdCategory;
        }

        public void setThirdCategory(String thirdCategory) {
            this.thirdCategory = thirdCategory;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getShoppingTimeStar() {
            return shoppingTimeStar;
        }

        public void setShoppingTimeStar(String shoppingTimeStar) {
            this.shoppingTimeStar = shoppingTimeStar;
        }

        public String getShoppingTimeEnd() {
            return shoppingTimeEnd;
        }

        public void setShoppingTimeEnd(String shoppingTimeEnd) {
            this.shoppingTimeEnd = shoppingTimeEnd;
        }

        public int getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(int minPrice) {
            this.minPrice = minPrice;
        }

        public String getMinPriceTip() {
            return minPriceTip;
        }

        public void setMinPriceTip(String minPriceTip) {
            this.minPriceTip = minPriceTip;
        }

        public int getShippingFee() {
            return shippingFee;
        }

        public void setShippingFee(int shippingFee) {
            this.shippingFee = shippingFee;
        }

        public String getShippingFeeTip() {
            return shippingFeeTip;
        }

        public void setShippingFeeTip(String shippingFeeTip) {
            this.shippingFeeTip = shippingFeeTip;
        }

        public String getBulletin() {
            return bulletin;
        }

        public void setBulletin(String bulletin) {
            this.bulletin = bulletin;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCallCenter() {
            return callCenter;
        }

        public void setCallCenter(String callCenter) {
            this.callCenter = callCenter;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getAveragePriceTip() {
            return averagePriceTip;
        }

        public void setAveragePriceTip(String averagePriceTip) {
            this.averagePriceTip = averagePriceTip;
        }

        public int getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(int commentNumber) {
            this.commentNumber = commentNumber;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
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

        public List<Discounts2Bean> getDiscounts2() {
            return discounts2;
        }

        public void setDiscounts2(List<Discounts2Bean> discounts2) {
            this.discounts2 = discounts2;
        }

        public static class Discounts2Bean {
            /**
             * info : 满20减18;满45减40;满60减53
             * icon_url : http://p0.meituan.net/xianfu/f8bc8dffdbc805878aa3801a33f563cd1001.png
             * promotion_type : 2
             */

            private String info;
            @SerializedName("icon_url")
            private String iconUrl;
            @SerializedName("promotion_type")
            private int promotionType;

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getIconUrl() {
                return iconUrl;
            }

            public void setIconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
            }

            public int getPromotionType() {
                return promotionType;
            }

            public void setPromotionType(int promotionType) {
                this.promotionType = promotionType;
            }
        }
    }
}
