package com.bitcode.webservices2

import android.os.AsyncTask

class WebThread : AsyncTask<Any?, Any?, UsersResponse?>() {

    override fun doInBackground(vararg p0: Any?): UsersResponse? {

        return WebUtil.getUsers2(1)

    }

    override fun onPostExecute(result: UsersResponse?) {
        super.onPostExecute(result)
    }
}