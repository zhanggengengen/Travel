package cn.itcast.travel.domain;

import java.util.List;

public class PageBean<T> {

    private int totalCount;//������
    private int nowPage;//��ǰҳ��
    private int pageSize;//ÿҳ��ʾ������
    private int totalPage;//��ҳ��
    private List<T> list;//ÿҳ��ʾ�����ݼ���

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
