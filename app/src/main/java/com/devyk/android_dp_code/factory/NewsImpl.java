package com.devyk.android_dp_code.factory;

import android.util.Log;

/**
 * <pre>
 *     author  : devyk on 2019-09-04 23:41
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is NewsImpl
 * </pre>
 */
public class NewsImpl implements IFunctionModule {

    private String TAG = getClass().getSimpleName();

    @Override
    public void function() {
        Log.i(TAG, "看新闻");

    }
}
