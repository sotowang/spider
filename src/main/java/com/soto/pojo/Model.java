package com.soto.pojo;

public class Model {
    private String modelId;
    private String modelName;
    private String modelPrice;

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

    @Override
    public String toString() {
        return "Model{" +
                "modelId='" + modelId + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelPrice='" + modelPrice + '\'' +
                '}';
    }
}
