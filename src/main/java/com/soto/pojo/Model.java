package com.soto.pojo;

public class Model {
    private String modelId;
    private String modelName;
    private String modelPrice;
    private String modelDesc;
    private String modelImg;
    private String modelShop;
    private String modelCount;
    private String modelComment;
    private String modelAddr;

    public Model() {
    }

    public Model(String modelId, String modelName, String modelPrice, String modelDesc, String modelImg, String modelShop, String modelCount, String modelComment) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
        this.modelDesc = modelDesc;
        this.modelImg = modelImg;
        this.modelShop = modelShop;
        this.modelCount = modelCount;
        this.modelComment = modelComment;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(String modelPrice) {
        this.modelPrice = modelPrice;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    public String getModelImg() {
        return modelImg;
    }

    public void setModelImg(String modelImg) {
        this.modelImg = modelImg;
    }

    public String getModelShop() {
        return modelShop;
    }

    public void setModelShop(String modelShop) {
        this.modelShop = modelShop;
    }

    public String getModelCount() {
        return modelCount;
    }

    public void setModelCount(String modelCount) {
        this.modelCount = modelCount;
    }

    public String getModelComment() {
        return modelComment;
    }

    public void setModelComment(String modelComment) {
        this.modelComment = modelComment;
    }

    public String getmodelId() {
        return modelId;
    }

    public void setmodelId(String modelId) {
        this.modelId = modelId;
    }

    public String getmodelName() {
        return modelName;
    }

    public void setmodelName(String modelName) {
        this.modelName = modelName;
    }

    public String getmodelPrice() {
        return modelPrice;
    }

    public void setmodelPrice(String modelPrice) {
        this.modelPrice = modelPrice;
    }

    public String getModelAddr() {
        return modelAddr;
    }

    public void setModelAddr(String modelAddr) {
        this.modelAddr = modelAddr;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelId='" + modelId + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelPrice='" + modelPrice + '\'' +
                ", modelDesc='" + modelDesc + '\'' +
                ", modelImg='" + modelImg + '\'' +
                ", modelShop='" + modelShop + '\'' +
                ", modelCount='" + modelCount + '\'' +
                ", modelComment='" + modelComment + '\'' +
                ", modelAddr='" + modelAddr + '\'' +
                '}';
    }
}
