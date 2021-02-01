package com.tdg.analytic.core.entity;

import java.util.List;
import java.util.Map;

import com.tdg.analytic.core.entity.enums.AudienceViewType;
import lombok.Data;

@Data
public class AudiencePreference {
  private final AudienceViewType viewType;
  private final Map<String, List<String>> preferenceFilter;
}
