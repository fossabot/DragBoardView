package com.time.cat.dragboardview.callback;

/**
 * @author dlink
 * @email linxy59@mail2.sysu.edu.cn
 * @date 2018/4/3
 * @discription null
 * @usage null
 */
public interface DragAdapterCallBack {
    /**
     * call if on drag item
     * @param position item position in Item List (which in VerticalRecyclerView)
     *                 0 <= position <= size()-1
     *                 拖动的 View 在纵向 recyclerView 上的 position
     */
    void onDrag(int position);

    /**
     * call if on drop item
     * @param page item position in Entry List (which in HorizontalRecyclerView)
     *             拖动的 View 在横向 recyclerView 上的 position
     * @param position drop item to position in entry.getItemList()
     *                 0 <= position <= size()-1
     *                 拖动的 View 在纵向 recyclerView 上的 position
     * @param tag convert it to your Item object
     */
    void onDrop(int page, int position, Object tag);

    /**
     * call if on drag out of current entry page
     */
    void onDragOut();

    /**
     * call if on drag in of current entry page
     *
     * @param position item position in Item List (which in VerticalRecyclerView)
     *                 0 <= position <= size()-1
     *                 拖动的 View 在纵向 recyclerView 上的 position
     * @param tag convert it to your Item object
     */
    void onDragIn(int position, Object tag);

    /**
     * call if event.getAction() == MotionEvent.ACTION_MOVE
     *
     * @param position item position in Item List (VerticalRecyclerView)
     *                 0 <= position <= size()-1
     *                 拖动的 View 在纵向 recyclerView 上的 position
     */
    void updateDragItemVisibility(int position);
}
