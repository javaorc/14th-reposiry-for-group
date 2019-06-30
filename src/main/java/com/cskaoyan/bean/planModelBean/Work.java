package com.cskaoyan.bean.planModelBean;

public class Work {
    private String workId;

    private String processNumber;

    private Integer rating;

    private String productId;

    private String ProcessId;

    private String DeviceId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProcessId() {
        return ProcessId;
    }

    public void setProcessId(String processId) {
        ProcessId = processId;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    private Product product;

    private Process process;

    private Device device;

    public Work() {
    }

    public Work(String workId, String processNumber, Integer rating, Product product, Process process, Device device) {
        this.workId = workId;
        this.processNumber = processNumber;
        this.rating = rating;
        this.product = product;
        this.process = process;
        this.device = device;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getProcessNumber() {
        return processNumber;
    }

    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workId='" + workId + '\'' +
                ", processNumber='" + processNumber + '\'' +
                ", rating=" + rating +
                ", product=" + product +
                ", process=" + process +
                ", device=" + device +
                '}';
    }
}