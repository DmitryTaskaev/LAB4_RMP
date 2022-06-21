/**
 * Класс спортсмен
 * @property sp_family - Фамилия спортсмена [String]
 * @property sot_kol - Число соревнований [Double]
 * @property sp_win - Cумма мест, занятых спортсменом в соревнованиях [Double]
 * @property P - Занимал ли хотя бы раз первое место [Boolean]
 *
 * @author Таскаев Дмитрий
 */
class SportsmenChild(_sp_family:String, _sor_kol:Double, _sp_win:Double, _P:Boolean): Sportsmen(_sp_family,_sor_kol,_sp_win) {
    private  var P: Boolean
    init {
        P = _P
    }
    /**
     * Расчёт качества объекта с условием
     * Если @param[P] = true
     * @return Качество умножается на 1.5 [Double]
     * Если @param[P] = False
     * @return Выводится неизменное качество [Double]
     *
     * @author Таскаев Дмитрий
     */
    override fun Quality(): Double {
        return if (P){
            super.Quality() * 1.5
        } else {
            super.Quality()
        }
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
    open override fun printInfo(): String {
        return super.printInfo()
    }
}