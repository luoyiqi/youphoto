package cn.bill56.youphoto.adapter;

import java.util.List;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * 承载引导页的ViewPager所使用的Adapter
 *
 * @author Bill56
 *
 */
public class GuideViewPagerAdapter extends PagerAdapter {

    // 上下文环境
    private Context context;
    // 承载引导页界面的View对象集合
    private List<View> views = null;

    /**
     * 带形参的构造方法
     *
     * @param context
     *            上下文环境
     * @param views
     *            承载引导页界面的View对象集合
     */
    public GuideViewPagerAdapter(Context context, List<View> views) {
        super();
        this.context = context;
        this.views = views;
    }

    /**
     * 加载每一项view的时候使用，类似于ListView中getView()方法
     */
    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager)container).addView(views.get(position));
        return views.get(position);
    }

    /**
     * 当不用的view可以移除掉
     */
    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager)container).removeView(views.get(position));
    }

    /**
     * 获取引导页的数量
     */
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return views.size();
    }

    /**
     * 判断是否是当前view
     */
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return (arg0 == arg1);
    }

}
