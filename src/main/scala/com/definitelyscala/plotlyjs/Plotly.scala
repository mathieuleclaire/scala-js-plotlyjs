package com.definitelyscala.plotlyjs

import com.definitelyscala.plotlyjs.Plotly._
import com.definitelyscala.plotlyjs.plotlyConts._
import org.scalajs.dom.raw.HTMLElement

import scala.language.implicitConversions
import org.querki.jsext._

import scala.scalajs.js
import js.|
import scala.scalajs.js.annotation.JSGlobal

object PlotlyImplicits {
  implicit def elToPlotlyElement[T <: HTMLElement](element: T): PlotlyHTMLElement = element.asInstanceOf[PlotlyHTMLElement]

  implicit def thisBuilderToThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: B): T = b._result

  implicit def thisBuilderToUndefForThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: B): js.UndefOr[T] = b._result
}

@js.native
@JSGlobal
object Plotly extends PlotlyStatic

@js.native
trait PlotlyHTMLElement extends js.Object {
  def on(event: PlotEvent, callback: js.Function1[PointsData, Unit]): Unit

  def on(event: PlotEvent, callback: js.Function0[Unit]): Unit
}

@js.native
trait ToImgopts extends js.Object {
  var format: String = js.native
  var width: Double = js.native
  var height: Double = js.native
}

@js.native
trait DownloadImgopts extends js.Object {
  var format: String = js.native
  var width: Double = js.native
  var height: Double = js.native
  var filename: String = js.native
}

@js.native
trait Layout extends js.Object {
  var title: js.UndefOr[String] = js.native
  var autosize: js.UndefOr[Boolean] = js.native
  var showlegend: js.UndefOr[Boolean] = js.native
  var xaxis: js.UndefOr[Axis] = js.native
  var yaxis: js.UndefOr[Axis] = js.native
  var margin: js.UndefOr[Margin] = js.native
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var hovermode: js.UndefOr[String] = js.native
  var dragmode: js.UndefOr[String] = js.native
  var shapes: js.UndefOr[js.Array[Shape]] = js.native
  var legend: js.UndefOr[Legend] = js.native
}

object Layout extends LayoutBuilder(noOpts)

class LayoutBuilder(val dict: OptMap) extends JSOptionBuilder[Layout, LayoutBuilder](new LayoutBuilder(_)) {
  def title(v: String) = jsOpt("title", v)

  def hovermode(v: String) = jsOpt("hovermode", v)

  def autosize(v: Boolean) = jsOpt("autosize", v)

  def showlegend(v: Boolean) = jsOpt("showlegend", v)

  def xaxis(v: Axis) = jsOpt("xaxis", v)

  def yaxis(v: Axis) = jsOpt("yaxis", v)

  def margin(v: Margin) = jsOpt("margin", v)

  def height(v: Double) = jsOpt("height", v)

  def width(v: Double) = jsOpt("width", v)

  def dragmode(v: String) = jsOpt("dragmode", v)

  def shapes(v: js.Array[Shape]) = jsOpt("shapes", v)

  def legend(v: Legend) = jsOpt("legend", v)
}

@js.native
trait Legend extends js.Object {
  var traceorder: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[String] = js.native
  var tracegroupgap: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[String] = js.native
  var yanchor: js.UndefOr[String] = js.native
}

object Legend extends LegendBuilder(noOpts)

class LegendBuilder(val dict: OptMap) extends JSOptionBuilder[Legend, LegendBuilder](new LegendBuilder(_)) {
  def traceorder(v: String) = jsOpt("traceorder", v)

  def x(v: Double) = jsOpt("x", v)

  def y(v: Double) = jsOpt("y", v)

  def font(v: Font) = jsOpt("font", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def orientation(v: String) = jsOpt("orientation", v)

  def tracegroupgap(v: Double) = jsOpt("tracegroupgap", v)

  def xanchor(v: String) = jsOpt("xanchor", v)

  def yanchor(v: String) = jsOpt("yanchor", v)
}

@js.native
trait Axis extends js.Object {
  var title: js.UndefOr[String] = js.native
  var showgrid: js.UndefOr[Boolean] = js.native
  var fixedrange: js.UndefOr[Boolean] = js.native
  var rangemode: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[AxisType] = js.native
  var tickformat: js.UndefOr[String] = js.native
  var hoverformat: js.UndefOr[String] = js.native
  var rangeslider: js.UndefOr[RangeSlider] = js.native
  var rangeselector: js.UndefOr[RangeSelector] = js.native
  var range: js.UndefOr[js.Array[Datum]] = js.native
  var showticklabels: js.UndefOr[Boolean] = js.native
  var autotick: js.UndefOr[Boolean] = js.native
  var zeroline: js.UndefOr[Boolean] = js.native
  var autorange: js.UndefOr[Boolean | String] = js.native
}

object Axis extends AxisBuilder(noOpts)

class AxisBuilder(val dict: OptMap) extends JSOptionBuilder[Axis, AxisBuilder](new AxisBuilder(_)) {
  def title(v: String) = jsOpt("title", v)

  def showgrid(v: Boolean) = jsOpt("showgrid", v)

  def fixedrange(v: Boolean) = jsOpt("fixedrange", v)

  def rangemode(v: String) = jsOpt("rangemode", v)

  def `type`(v: AxisType) = jsOpt("type", v)

  def tickformat(v: String) = jsOpt("tickformat", v)

  def hoverformat(v: String) = jsOpt("hoverformat", v)

  def rangeslider(v: RangeSlider) = jsOpt("rangeslider", v)

  def rangeselector(v: RangeSelector) = jsOpt("rangeselector", v)

  def range(v1: Datum, v2: Datum) = jsOpt("range", js.Array(v1, v2))

  def showticklabels(v: Boolean) = jsOpt("showticklabels", v)

  def autotick(v: Boolean) = jsOpt("auotick", v)

  def zeroline(v: Boolean) = jsOpt("zeroline", v)

  def autorange(v: Boolean | String) = jsOpt("autorange", v)
}

@js.native
trait Shape extends js.Object {
  var visible: Boolean = js.native
  var layer: String = js.native
  var `type`: String = js.native
  var path: String = js.native
  var xref: String = js.native
  var yref: String = js.native
  var x0: Datum = js.native
  var y0: Datum = js.native
  var x1: Datum = js.native
  var y1: Datum = js.native
  var fillcolor: String = js.native
  var opacity: Double = js.native
  var line: Option[PlotLine] = js.native
}

@js.native
trait Margin extends js.Object {
  var t: Double = js.native
  var b: Double = js.native
  var l: Double = js.native
  var r: Double = js.native
}

@js.native
trait PointsData extends js.Object {
  var points: js.Array[PointData] = js.native
}

@js.native
trait PointData extends js.Object {
  val curveNumber: Int = js.native
  val pointNumber: Int = js.native
  val customdata: String = js.native
  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
  val data: PlotData = js.native
}

@js.native
trait PlotData extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var x: js.UndefOr[DatumArray | DatumMatrix] = js.native
  var y: js.UndefOr[DatumArray | DatumMatrix] = js.native
  var z: js.UndefOr[DatumArray | DatumMatrix] = js.native
  var customdata: js.UndefOr[js.Array[String]] = js.native
  var text: js.UndefOr[String | js.Array[String]] = js.native
  var line: js.UndefOr[PlotLine] = js.native
  var marker: js.UndefOr[PlotMarker] = js.native
  var mode: js.UndefOr[PlotMode] = js.native
  var hoveron: js.UndefOr[String] = js.native
  var hoverinfo: js.UndefOr[String] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillcolor: js.UndefOr[String] = js.native
  var legendgroup: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var connectgaps: js.UndefOr[Boolean] = js.native
}

object PlotData extends PlotDataBuilder(noOpts)

class PlotDataBuilder(val dict: OptMap) extends JSOptionBuilder[PlotData, PlotDataBuilder](new PlotDataBuilder(_)) {
  def `type`(v: String) = jsOpt("type", v)

  def x(v: DatumArray | DatumMatrix) = jsOpt("x", v)

  def y(v: DatumArray | DatumMatrix) = jsOpt("y", v)

  def z(v: DatumArray | DatumMatrix) = jsOpt("y", v)

  def customdata(v: js.Array[String]) = jsOpt("customdata", v)

  def text(v: String | js.Array[String]) = jsOpt("text", v)

  def line(v: PlotLine) = jsOpt("line", v)

  // def marker(v: PlotMarker) = jsOpt("marker", v)

  def set(v: PlotMarker) = jsOpt("marker", v)

  /*
   * Any combination of "lines", "markers", "text" joined with a "+" OR "none".
   * examples: "lines", "markers", "lines+markers", "lines+markers+text", "none"
   * Determines the drawing mode for this scatter trace.
   * If the provided `mode` includes "text" then the `text` elements appear at the coordinates.
   * Otherwise, the `text` elements appear on hover.
   * If there are less than 20 points, then the default is "lines+markers". Otherwise, "lines".
   *
  */
  def set(v: PlotMode) = jsOpt("mode", v.toJS)

  def hoveron(v: String) = jsOpt("hoveron", v)

  def hoverinfo(v: String) = jsOpt("hoverinfo", v)

  def fill(v: String) = jsOpt("fill", v)

  def fillcolor(v: String) = jsOpt("fillcolor", v)

  def legendgroup(v: String) = jsOpt("legendgroup", v)

  def name(v: String) = jsOpt("name", v)

  def connectgaps(v: Boolean) = jsOpt("connectgaps", v)
}

@js.native
trait PlotMarker extends js.Object {
  val symbol: js.UndefOr[String | js.Array[String]] = js.native
  val color: js.UndefOr[Color] = js.native
  val colorscale: js.UndefOr[String] = js.native
  val cmin: js.UndefOr[Double] = js.native
  val cmax: js.UndefOr[Double] = js.native
  val line: js.UndefOr[PlotLine] = js.native
  val opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  val size: js.UndefOr[Double | js.Array[Double]] = js.native
  val maxdisplayed: js.UndefOr[Double] = js.native
  val sizeref: js.UndefOr[Double] = js.native
  val sizemin: js.UndefOr[Double] = js.native
  val sizemode: js.UndefOr[SizeMode] = js.native
  val showscale: js.UndefOr[Boolean] = js.native
}

object PlotMarker extends PlotMarkerBuilder(noOpts)

class PlotMarkerBuilder(val dict: OptMap) extends JSOptionBuilder[PlotMarker, PlotMarkerBuilder](new PlotMarkerBuilder(_)) {
  /*
   *  enumerated or array of enumerateds :
   *  "0" | "circle" | "100" | "circle-open" | "200" | "circle-dot" | "300" | "circle-open-dot" |
   *  "1" | "square" | "101" | "square-open" | "201" | "square-dot" | "301" | "square-open-dot" |
   *  "2" | "diamond" | "102" | "diamond-open" | "202" | "diamond-dot" | "302" | "diamond-open-dot" |
   *  "3" | "cross" | "103" | "cross-open" | "203" | "cross-dot" | "303" | "cross-open-dot" |
   *  "4" | "x" | "104" | "x-open" | "204" | "x-dot" | "304" | "x-open-dot" |
   *  "5" | "triangle-up" | "105" | "triangle-up-open" | "205" | "triangle-up-dot" | "305" | "triangle-up-open-dot" |
   *  "6 "| "triangle-down" | "106" | "triangle-down-open" | "206" | "triangle-down-dot" | "306" | "triangle-down-open-dot" |
   *  "7" | "triangle-left" | "107" | "triangle-left-open" | "207" | "triangle-left-dot" | "307" | "triangle-left-open-dot" |
   *  "8" | "triangle-right" | "108" | "triangle-right-open" | "208" | "triangle-right-dot" | "308" | "triangle-right-open-dot" |
   *  "9" | "triangle-ne" | "109" | "triangle-ne-open" | "209" | "triangle-ne-dot" | "309" | "triangle-ne-open-dot" |
   *  "10" | "triangle-se" | "110" | "triangle-se-open" | "210" | "triangle-se-dot" | "310" | "triangle-se-open-dot" |
   *  "11" | "triangle-sw" | "111" | "triangle-sw-open" | "211" | "triangle-sw-dot" | "311" | "triangle-sw-open-dot" |
   *  "12" | "triangle-nw" | "112" | "triangle-nw-open" | "212" | "triangle-nw-dot" | "312" | "triangle-nw-open-dot" |
   *  "13" | "pentagon" | "113" | "pentagon-open" | "213" | "pentagon-dot" | "313" | "pentagon-open-dot" |
   *  "14" | "hexagon"  | "114" | "hexagon-open" | "214" | "hexagon-dot" | "314" | "hexagon-open-dot" |
   *  "15" | "hexagon2" | "115" | "hexagon2-open" | "215" | "hexagon2-dot" | "315" | "hexagon2-open-dot" |
   *  "16" | "octagon"  |"116" | "octagon-open" | "216" | "octagon-dot" | "316" | "octagon-open-dot" |
   *  "17" | "star" | 117" | "star-open" | "217" | "star-dot" | "317" | "star-open-dot" |
   *  "18" | "hexagram" | "118" | "hexagram-open" | "218" | "hexagram-dot" | "318" | "hexagram-open-dot" |
   *  "19" | "star-triangle-up" | "119" | "star-triangle-up-open" | "219" | "star-triangle-up-dot" | "319" | "star-triangle-up-open-dot" |
   *  "20" | "star-triangle-down" | "120" | "star-triangle-down-open" | "220" | "star-triangle-down-dot" | "320" | "star-triangle-down-open-dot" |
   *  "21" | "star-square" | "121" | "star-square-open" | "221" | "star-square-dot" | "321" | "star-square-open-dot" |
   *  "22" | "star-diamond" | "122" | "star-diamond-open" | "222" | "star-diamond-dot" | "322" | "star-diamond-open-dot" |
   *  "23" | "diamond-tall" | "123" | "diamond-tall-open" | "223" | "diamond-tall-dot" | "323" | "diamond-tall-open-dot" |
   *  "24" | "diamond-wide" | "124" | "diamond-wide-open" | "224" | "diamond-wide-dot" | "324" | "diamond-wide-open-dot" |
   *  "25" | "hourglass" | "125" | "hourglass-open" |
   *  "26" | "bowtie" | "126" | "bowtie-open" |
   *  "27" | "circle-cross" | "127" | "circle-cross-open" |
   *  "28" | "circle-x" | "128" | "circle-x-open" |
   *  "29" | "square-cross" | "129" | "square-cross-open" |
   *  "30" | "square-x" | "130" | "square-x-open" |
   *  "31" | "diamond-cross" | "131" | "diamond-cross-open" |
   *  "32" | "diamond-x" | "132" | "diamond-x-open" |
   *  "33" | "cross-thin" | "133" | "cross-thin-open" |
   *  "34" | "x-thin" | "134" | "x-thin-open" |
   *  "35" | "asterisk" | "135" | "asterisk-open" |
   *  "36" | "hash" | "136" | "hash-open" | "236" | "hash-dot" | "336" | "hash-open-dot" |
   *  "37" | "y-up" | "137" | "y-up-open" |
   *  "38" | "y-down" | "138" | "y-down-open" |
   *  "39" | "y-left" | "139" | "y-left-open" |
   *  "40" | "y-right" | "140" | "y-right-open" |
   *  "41" | "line-ew" | "141" | "line-ew-open" |
   *  "42" | "line-ns" | "142" | "line-ns-open" |
   *  "43" | "line-ne" | "143" | "line-ne-open" |
   *  "44" | "line-nw" | "144" | "line-nw-open" )
   *  default: "circle"
   *
   * Reference: Plotly.js API
   */
  def set(v: Symbol) = jsOpt("symbol", v.toJS)

  /*
   * Sets the marker color.
   * It accepts either a specific color or an array of numbers that are mapped to the
   * colorscale relative to the max and min values of the array or relative to `cmin` and `cmax` if set.
   *
   * Reference: Plotly.js API
   */
  //  def color(v: Color) = jsOpt("color", v.toJS)

  def set(v: Color) = jsOpt("color", v.toJS)

  /*
   * Sets the colorscale and only has an effect if `marker.color` is set to a numerical array.
   * The colorscale must be an array containing arrays mapping a normalized value to an rgb, rgba, hex, hsl, hsv,
   * or named color string. At minimum, a mapping for the lowest (0) and highest (1) values are required.
   * For example, `[[0, 'rgb(0,0,255)', [1, 'rgb(255,0,0)']]`.
   * To control the bounds of the colorscale in color space, use `marker.cmin` and `marker.cmax`.
   * Alternatively, `colorscale` may be a palette name string of the following list: Greys, YlGnBu, Greens, YlOrRd,
   * Bluered, RdBu, Reds, Blues, Picnic, Rainbow, Portland, Jet, Hot, Blackbody, Earth, Electric, Viridis
   *
   * Reference: Plotly.js API
   */
  def set(v: ColorScale) = jsOpt("colorscale", v.toJS)

  def set(l: PlotLine) = jsOpt("line", l)

  /*
   * Number or array of numbers between or equal to 0 and 1)
   * Sets the marker opacity.
   *
   * Reference: Plotly.js API
   */
  def opacity(v: Double | js.Array[Double]) = jsOpt("opacity", v)

  /*
   * Number or array of numbers greater than or equal to 0, default: 6
   * Sets the marker size (in px).
   *
   * Reference: Plotly.js API
   */
  def size(v: Double | js.Array[Double]) = jsOpt("size", v)

  /*
   * Number greater than or equal to 0, default: 0
   * Sets a maximum number of points to be drawn on the graph.
   * "0" corresponds to no limit.
   *
   * Reference: Plotly.js API
   */
  def maxdisplayed(v: Double) = jsOpt("maxdisplayed", v)

  /*
   *default: 1
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the scale factor used to determine the rendered size of marker points.
   * Use with `sizemin` and `sizemode`.
   * Reference: Plotly.js API
   */
  def sizeref(v: Double) = jsOpt("sizref", v)

  /*
   * default: 0
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the minimum size (in px) of the rendered marker points.
   *
   * Reference: Plotly.js API
   */
  def sizemin(v: Double) = jsOpt("sizemin", v)

  /*
   * default: "diameter"
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the rule for which the data in `size` is converted to pixels.
   *
   * Reference: Plotly.js API
   */
  def set(v: SizeMode) = jsOpt("sizemode", v.toJS)

  /*
     * Has an effect only if `marker.color` is set to a numerical array.
     * Reverses the color mapping if true (`cmin` will correspond to the last color
     * in the array and `cmax` will correspond to the first color).
     * Reference: Plotly.js API
     */
  def reversescale(v: Boolean) = jsOpt("reversescale", v)

  /*
     * Has an effect only if `marker.color` is set to a numerical array.
     * Sets the lower bound of the color domain.
     * Value should be associated to the `marker.color` array index,
     * and if set, `marker.cmax` must be set as well.
     *
     * Reference: Plotly.js API
     */
  def cmin(v: Double) = jsOpt("cmin", v)

  /*
   * Has an effect only if `marker.color` is set to a numerical array.
   * Sets the upper bound of the color domain.
   * Value should be associated to the `marker.color` array index,
   * and if set, `marker.cmin` must be set as well.
   * Reference: Plotly.js API
   */
  def cmax(v: Double) = jsOpt("cmax", v)

  /*
   * Has an effect only if `marker.color` is set to a numerical array.
   * Determines whether or not a colorbar is displayed.
   *
   * Reference: Plotly.js API
   */
  def showscale(v: Boolean) = jsOpt("showscale", v)
}

@js.native
trait PlotLine extends js.Object {
  val color: js.UndefOr[Color] = js.native
  val width: js.UndefOr[Double] = js.native
  val dash: js.UndefOr[Dash] = js.native
  val shape: js.UndefOr[String] = js.native
  val smoothing: js.UndefOr[Double] = js.native
  val simplify: js.UndefOr[Boolean] = js.native
}

object PlotLine extends PlotLineBuilder(noOpts)

class PlotLineBuilder(val dict: OptMap) extends JSOptionBuilder[PlotLine, PlotLineBuilder](new PlotLineBuilder(_)) {
  def set(v: Color) = jsOpt("color", v.toJS)

  def width(v: Double) = jsOpt("width", v)

  def dash(v: Dash) = jsOpt("dash", v)

  def shape(v: String) = jsOpt("shape", v)

  def smoothing(v: Double) = jsOpt("smoothing", v)

  def simplify(v: Boolean) = jsOpt("simplify", v)
}

@js.native
trait Font extends js.Object {
  var family: String = js.native
  var size: Double = js.native
  var color: String = js.native
}

@js.native
trait Config extends js.Object {
  var staticPlot: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var autosizable: js.UndefOr[Boolean] = js.native
  var queueLength: js.UndefOr[Double] = js.native
  var fillFrame: js.UndefOr[Boolean] = js.native
  var frameMargins: js.UndefOr[Double] = js.native
  var scrollZoom: js.UndefOr[Boolean] = js.native
  var doubleClick: js.UndefOr[String] = js.native
  var showTips: js.UndefOr[Boolean] = js.native
  var showLink: js.UndefOr[Boolean] = js.native
  var sendData: js.UndefOr[Boolean] = js.native
  var linkText: js.UndefOr[String] = js.native
  var showSources: js.UndefOr[Boolean] = js.native
  var displayModeBar: js.UndefOr[String | Boolean] = js.native
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  var modeBarButtons: js.UndefOr[js.Array[js.Array[ModeBarButtons]]] = js.native
  var displaylogo: js.UndefOr[Boolean] = js.native
  var plotGlPixelRatio: js.UndefOr[Double] = js.native
  var setBackground: js.UndefOr[String] = js.native
  var topojsonURL: js.UndefOr[String] = js.native
  var mapboxAccessToken: js.UndefOr[String] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var globalTransforms: js.UndefOr[js.Array[js.Any]] = js.native
}

object Config extends ConfigBuilder(noOpts)

class ConfigBuilder(val dict: OptMap) extends JSOptionBuilder[Config, ConfigBuilder](new ConfigBuilder(_)) {
  def staticPlot(v: Boolean) = jsOpt("staticPlot", v)

  def editable(v: Boolean) = jsOpt("editable", v)

  def autosizable(v: Boolean) = jsOpt("autosizable", v)

  def queueLength(v: Double) = jsOpt("queueLength", v)

  def fillFrame(v: Boolean) = jsOpt("fillFrame", v)

  def frameMargins(v: Double) = jsOpt("frameMargins", v)

  def scrollZoom(v: Boolean) = jsOpt("scrollZoom", v)

  def doubleClick(v: String) = jsOpt("doubleClick", v)

  def showTips(v: Boolean) = jsOpt("showTips", v)

  def showLink(v: Boolean) = jsOpt("showLink", v)

  def sendData(v: Boolean) = jsOpt("sendData", v)

  def linkText(v: String) = jsOpt("linkText", v)

  def showSources(v: Boolean) = jsOpt("showSources", v)

  def displayModeBar(v: String | Boolean) = jsOpt("displayModeBar", v)

  def modeBarButtonsToRemove(v: js.Array[ModeBarButtons]) = jsOpt("modeBarButtonsToRemove", v)

  def modeBarButtonsToAdd(v: js.Array[ModeBarButtons]) = jsOpt("modeBarButtonsToAdd", v)

  def modeBarButtons(v: js.Array[js.Array[ModeBarButtons]]) = jsOpt("modeBarButtons", v)

  def displaylogo(v: Boolean) = jsOpt("displaylogo", v)

  def plotGlPixelRatio(v: Double) = jsOpt("plotGlPixelRatio", v)

  def setBackground(v: String) = jsOpt("setBackground", v)

  def topojsonURL(v: String) = jsOpt("topojsonURL", v)

  def mapboxAccessToken(v: String) = jsOpt("mapboxAccessToken", v)

  def logging(v: Boolean) = jsOpt("logging", v)

  def globalTransforms(v: js.Array[js.Any]) = jsOpt("globalTransforms", v)
}

@js.native
trait RangeSlider extends js.Object {
  var visible: js.UndefOr[Boolean] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var bgcolor: js.UndefOr[String] = js.native
}

object RangeSlider extends RangeSliderBuilder(noOpts)

class RangeSliderBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSlider, RangeSliderBuilder](new RangeSliderBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)

  def thickness(v: Double) = jsOpt("thickness", v)

  def range(v: js.Tuple2[Datum, Datum]) = jsOpt("range", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)
}

@js.native
trait RangeSelectorButton extends js.Object {
  var step: js.UndefOr[String] = js.native
  var stepmode: js.UndefOr[String] = js.native
  var count: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
}

object RangeSelectorButton extends RangeSelectorButtonBuilder(noOpts)

class RangeSelectorButtonBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSelectorButton, RangeSelectorButtonBuilder](new RangeSelectorButtonBuilder(_)) {
  def step(v: String) = jsOpt("step", v)

  def stepmode(v: String) = jsOpt("stepmode", v)

  def count(v: Double) = jsOpt("count", v)

  def label(v: String) = jsOpt("label", v)
}

@js.native
trait RangeSelector extends js.Object {
  var buttons: js.UndefOr[js.Array[RangeSelectorButton]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[String] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var activecolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
}

object RangeSelector extends RangeSelectorBuilder(noOpts)

class RangeSelectorBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSelector, RangeSelectorBuilder](new RangeSelectorBuilder(_)) {
  def buttons(v: js.Array[RangeSelectorButton]) = jsOpt("buttons", v)

  def visible(v: Boolean) = jsOpt("visble", v)

  def x(v: Double) = jsOpt("x", v)

  def xanchor(v: String) = jsOpt("xanchor", v)

  def y(v: Double) = jsOpt("y", v)

  def yanchor(v: String) = jsOpt("yanchor", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)

  def activecolor(v: String) = jsOpt("activecolor", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def font(v: Font) = jsOpt("font", v)
}