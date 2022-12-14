package com.example.shoponline.domain.best

import com.google.gson.annotations.SerializedName

class BestSeller(best: List<Best?>) {

    @SerializedName("best_seller")
    private var best: List<Best?> = best
        get() { return best }
}