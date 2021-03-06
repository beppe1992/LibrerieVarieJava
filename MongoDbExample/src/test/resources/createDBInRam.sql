CREATE TABLE AVT005TB
(
   COD_SOC decimal(3,0) DEFAULT 0.0 NOT NULL,
   COD_PGM char(8) DEFAULT ' ' NOT NULL,
   DAT_SCAR_1 date DEFAULT CURRENT DATE NOT NULL,
   DAT_SCAR_2 date DEFAULT CURRENT DATE NOT NULL,
   USER_OPER char(8) DEFAULT ' ' NOT NULL,
   DAT_OPER date DEFAULT CURRENT DATE NOT NULL
)
;
CREATE UNIQUE INDEX AVT005IX ON AVT005TB
(
  COD_SOC,
  COD_PGM
)
;


INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (225,'DATRUNBT',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'AC004BP ',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'AINC08BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'ALQG56BP',CURRENT DATE,CURRENT DATE,'ALQG56BP',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'ASTF03BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'ASTF25BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'AUL025BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'AUL030BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'DATRUNBT',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBARC26',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBARC67',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ACT072BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'AD062029',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ADP020BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'AINC09BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ANABPER0',CURRENT DATE,CURRENT DATE,'ANABPER0',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASG010BP',CURRENT DATE,CURRENT DATE,'MODCONTR',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASG016BP',CURRENT DATE,CURRENT DATE,'INSOLCON',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASIVO1BP',CURRENT DATE,CURRENT DATE,'ASIVO1BP',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASTF14BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASTF31BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASTF61BP',CURRENT DATE,CURRENT DATE,'AVT005TB',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASTF71BP',CURRENT DATE,CURRENT DATE,'AVT005TB',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'ASWSB072',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'AVB002BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'DAPDANNI',CURRENT DATE,CURRENT DATE,'DAPDANNI',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'DATRUNBT',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'DFFDAUTO',CURRENT DATE,CURRENT DATE,'DFFDAUTO',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'DFFDRAMI',CURRENT DATE,CURRENT DATE,'DFFDRAMI',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'INSOLCON',CURRENT DATE,CURRENT DATE,'INSOLCON',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'INSOLVIN',CURRENT DATE,CURRENT DATE,'INSOLVIN',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'MODCONTR',CURRENT DATE,CURRENT DATE,'MODCONTR',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'MSUTIL30',CURRENT DATE,CURRENT DATE,'MSUTIL30',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'POSTELGG',CURRENT DATE,CURRENT DATE,'POSTELGG',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (417,'POSTELMM',CURRENT DATE,CURRENT DATE,'POSTELMM',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'ASTF03BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'ASTF25BP',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'AVISC0BP',CURRENT DATE,CURRENT DATE,'AVISC0BP',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'DATRUNBT',CURRENT DATE,CURRENT DATE,'BATCH   ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS00',CURRENT DATE,CURRENT DATE,'VTBASS00',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS00',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS01',CURRENT DATE,CURRENT DATE,'VTBASS01',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS01',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS02',CURRENT DATE,CURRENT DATE,'VTBASS02',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS02',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS03',CURRENT DATE,CURRENT DATE,'VTBASS03',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS03',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS04',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS04',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS05',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS05',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBASS06',CURRENT DATE,CURRENT DATE,'VTBASS06',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBASS06',CURRENT DATE,CURRENT DATE,'FE1996  ',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (341,'VTBARC94',CURRENT DATE,CURRENT DATE,'VTBARC94',CURRENT DATE);
INSERT INTO AVT005TB (COD_SOC,COD_PGM,DAT_SCAR_1,DAT_SCAR_2,USER_OPER,DAT_OPER) VALUES (700,'VTBARC94',CURRENT DATE,CURRENT DATE,'FE2206  ',CURRENT DATE);
