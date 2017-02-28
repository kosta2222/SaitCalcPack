package com.kosta.antlr.svet;
import org.antlr.v4.runtime.misc.NotNull;

class svetBaseVisitorImpl extends svetBaseVisitor<Double>{

    @Override
    public Double visitInput(@NotNull svetParser.InputContext ctx) {
        return visit(ctx.svet());
             }

    @Override
    public Double visitSvet(@NotNull svetParser.SvetContext ctx) {

            return (visit(ctx.lamp()) + visit(ctx.comp())+visit(ctx.refrig())+visit(ctx.telic())) * (visit(ctx.rub()) / 1000.0) * visit(ctx.n());

    }

    @Override
    public Double visitToLamp(@NotNull svetParser.ToLampContext ctx) {
        //return super.visitToLamp(ctx);
        double   vatsForOursLamp=(visit(ctx.kolvoVat())*visit(ctx.amount()))*visit(ctx.rab());
        return vatsForOursLamp;
    }

    @Override
    public Double visitToAmount(@NotNull svetParser.ToAmountContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Double visitToRab(@NotNull svetParser.ToRabContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Double visitToKolVat(@NotNull svetParser.ToKolVatContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public Double visitToInt(@NotNull svetParser.ToIntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitToDouble(@NotNull svetParser.ToDoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitToRub(@NotNull svetParser.ToRubContext ctx) {
      double  rub=visit(ctx.atom());
        return rub;
    }

    @Override
    public Double visitToN(@NotNull svetParser.ToNContext ctx) {
       double  dni= visit(ctx.atom());
        return dni;
    }

    @Override
    public Double visitToComp(@NotNull svetParser.ToCompContext ctx) {
      double  vatsForOursComp=(visit(ctx.kolvoVat())*visit(ctx.amount()))*visit(ctx.rab());
        return vatsForOursComp;
    }

    @Override
    public Double visitToRefrig(@NotNull svetParser.ToRefrigContext ctx) {
        return (visit(ctx.kolvoVat())*visit(ctx.amount()))*visit(ctx.rab());
    }

    @Override
    public Double visitToTel(@NotNull svetParser.ToTelContext ctx) {
        return (visit(ctx.kolvoVat())*visit(ctx.amount()))*visit(ctx.rab());
    }
}