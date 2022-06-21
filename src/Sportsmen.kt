/**
 * Класс спортсмен
 * @property sp_family - Фамилия спортсмена [String]
 * @property sot_kol - Число соревнований [Double]
 * @property sp_win - Cумма мест, занятых спортсменом в соревнованиях [Double]
 *
 * @author Таскаев Дмитрий
*/
open class Sportsmen(_sp_family:String, _sor_kol:Double, _sp_win:Double) {
    private var sp_family: String
    private var sot_kol: Double
    private var sp_win: Double

    init {
        sp_family = _sp_family
        sot_kol = _sor_kol
        sp_win = _sp_win
    }
    /**
     * Расчёт качества объекта
     * @return - Качество объекта расчитывается по формуле (число соревнований)/ (сумма мест) [Double]
     *
     * @author Таскаев Дмитрий
     */
    open fun Quality():  Double{
        //return "${sot_kol/sp_win}"
        return (sot_kol/sp_win)
    }
    /**
     * Вывод иныормации на экран
     * @return - Строка с информацией [String]
     * @property sp_family - Фамилия спортсмена [String]
     * @property sot_kol - Число соревнований [Double]
     * @property sp_win - Сумма меси занятыъ спортсменом [Double]
     * @property Quality - Качество объекта [Double]
     *
     * @author Таскаев Дмитрий
     */
    open fun printInfo(): String{
        return "Фамилия спортсмена: $sp_family, Число соревнований: $sot_kol, Сумма мест занятых спортсменом: $sp_win, Качество: ${Quality()}\n"
    }
}