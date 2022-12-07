package com.pda.mobile.kafka.message;

public class MemoryInfo {

    private final String heap;
    private final String nonHeap;
    private final long timeStamp;
    private String connectionKey;

    public MemoryInfo(String heap, String nonHeap, String connectionKey) {
        this.timeStamp = System.currentTimeMillis();
        this.heap = heap;
        this.nonHeap = nonHeap;
        this.connectionKey = connectionKey;
    }

    public String getHeap() {
        return this.heap;
    }

    public String getNonHeap() {
        return this.nonHeap;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

	public String getConnectionKey() {
		return connectionKey;
	}

	public void setConnectionKey(String connectionKey) {
		this.connectionKey = connectionKey;
	}

}
