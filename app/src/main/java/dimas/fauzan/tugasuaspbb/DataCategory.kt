package dimas.fauzan.tugasuaspbb

object DataCategory {
    private val catImage = intArrayOf(
        R.drawable.makanan,
        R.drawable.minuman,
        R.drawable.snack,
        R.drawable.toko
    )

    private val catName = arrayOf(
        "Makanan",
        "Minuman",
        "Makanan Ringan",
        "Toko Kami"
    )

    private val catDes = arrayOf(
        "Ini adalah isi menu Makanan Wakydim",
        "Ini adalah isi menu Minuman Wakydim",
        "Ini adalah isi menu Snack Wakydim",
        "Toko kami berada di Jl Kebonjayaraya No 163"
    )

    val listData: ArrayList<Data>
        get() {
            val list = arrayListOf<Data>()
            for (position in catName.indices){
                val data = Data()
                data.name = catName[position]
                data.icon = catImage[position]
                data.des = catDes[position]
                list.add(data)
            }
            return list
        }
}