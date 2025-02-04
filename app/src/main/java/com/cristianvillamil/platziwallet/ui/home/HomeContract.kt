package com.cristianvillamil.platziwallet.ui.home

interface HomeContract {
    interface View {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }
    interface Presenter {
        fun retrieveFavoriteTransfers()
    }

    interface OnResponseCallBack {
        fun onResponse(favoriteList: List<FavoriteTransfer>)
    }
}