package com.andam.fp.domain.bean;

public class ShareWithBLOBs extends Share {
    private String shareContent;

    private byte[] shareType;

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent == null ? null : shareContent.trim();
    }

    public byte[] getShareType() {
        return shareType;
    }

    public void setShareType(byte[] shareType) {
        this.shareType = shareType;
    }
}